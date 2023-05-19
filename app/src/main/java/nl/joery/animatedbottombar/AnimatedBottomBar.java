package nl.joery.animatedbottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class AnimatedBottomBar extends View {
    public AnimatedBottomBar(Context context) {
        this(context, null);
    }

    public AnimatedBottomBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AnimatedBottomBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setOnTabSelectListener(AnimatedBottomBar.OnTabSelectListener onTabSelectListener) {
    }
}
