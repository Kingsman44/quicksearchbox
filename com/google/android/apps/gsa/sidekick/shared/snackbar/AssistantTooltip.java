package com.google.android.apps.gsa.sidekick.shared.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class AssistantTooltip extends TouchInterceptingFrameLayout {
    static {
        C91107f.m148859b(0.0f, 0.0f, 0.2f, 1.0f);
        C91107f.m148859b(0.4f, 0.0f, 1.0f, 1.0f);
        C91107f.m148859b(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public AssistantTooltip(Context context) {
        super(context);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!C91115n.m148877i((ViewGroup) findViewById(R.id.assistant_tooltip_content), motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        C58976aa aaVar = C58975e.f156826a;
        getVisibility();
        return true;
    }

    public AssistantTooltip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AssistantTooltip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
