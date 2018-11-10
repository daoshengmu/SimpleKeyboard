package com.daoshengmu.example.simplekeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import java.util.List;

public class CandidateView extends View {

    public  CandidateView(Context context) {
        super(context);
//        mSelectionHighlight = context.getResources().getDrawable(
//                android.R.drawable.list_selector_background);
//        mSelectionHighlight.setState(new int[] {
//                android.R.attr.state_enabled,
//                android.R.attr.state_focused,
//                android.R.attr.state_window_focused,
//                android.R.attr.state_pressed
//        });
//        Resources r = context.getResources();
//
//        setBackgroundColor(r.getColor(R.color.candidate_background));
//
//        mColorNormal = r.getColor(R.color.candidate_normal);
//        mColorRecommended = r.getColor(R.color.candidate_recommended);
//        mColorOther = r.getColor(R.color.candidate_other);
//        mVerticalPadding = r.getDimensionPixelSize(R.dimen.candidate_vertical_padding);
//
//        mPaint = new Paint();
//        mPaint.setColor(mColorNormal);
//        mPaint.setAntiAlias(true);
//        mPaint.setTextSize(r.getDimensionPixelSize(R.dimen.candidate_font_height));
//        mPaint.setStrokeWidth(0);
//
//        mGestureDetector = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
//            @Override
//            public boolean onScroll(MotionEvent e1, MotionEvent e2,
//                                    float distanceX, float distanceY) {
//                mScrolled = true;
//                int sx = getScrollX();
//                sx += distanceX;
//                if (sx < 0) {
//                    sx = 0;
//                }
//                if (sx + getWidth() > mTotalWidth) {
//                    sx -= distanceX;
//                }
//                mTargetScrollX = sx;
//                scrollTo(sx, getScrollY());
//                invalidate();
//                return true;
//            }
//        });
        setHorizontalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    public void setSuggestions(List<String> suggestions, boolean completions,
                               boolean typedWordValid) {
//        clear();
//        if (suggestions != null) {
//            mSuggestions = new ArrayList<String>(suggestions);
//        }
//        mTypedWordValid = typedWordValid;
//        scrollTo(0, 0);
//        mTargetScrollX = 0;
//        // Compute the total width
//        onDraw(null);
//        invalidate();
//        requestLayout();
    }
}
