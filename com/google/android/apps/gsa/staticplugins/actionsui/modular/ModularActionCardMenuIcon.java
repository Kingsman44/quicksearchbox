package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ModularActionCardMenuIcon extends ImageView implements C93584ch {

    /* renamed from: a */
    private C93602cz f261081a;

    public ModularActionCardMenuIcon(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final List mo87839b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f261081a = czVar;
    }

    /* renamed from: e */
    public final void mo87842e(int i, C88511e eVar) {
        setClickable(true);
        int i2 = 8;
        if (i != 1) {
            if (i == 3) {
                setVisibility(0);
                return;
            } else if (i != 6) {
                setVisibility(8);
                return;
            }
        }
        C93602cz czVar = this.f261081a;
        czVar.getClass();
        if (true == czVar.mo88038ag()) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        TransitionSet transitionSet = new TransitionSet();
        Object[] objArr = {this};
        transitionSet.addTransition(C93632eb.m154486a(getResources().getColor(R.color.action_card_medium_grey), objArr));
        if (!(i2 == 3 || i == 3 || i2 == 7)) {
            if (i == 7) {
                i = 7;
            }
            if (i2 == 7 || i == 7) {
                transitionSet.addTransition(C93632eb.m154488c(-1, getResources().getDisplayMetrics(), this));
            }
            return new Pair(transitionSet, (Object) null);
        }
        Object[] objArr2 = {this};
        transitionSet.addTransition(C93632eb.m154486a(getResources().getColor(R.color.action_card_medium_grey), objArr2));
        transitionSet.addTransition(C93632eb.m154488c(-1, getResources().getDisplayMetrics(), this));
        return new Pair(transitionSet, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        C89941l.m146512c(this, 8344);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public ModularActionCardMenuIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModularActionCardMenuIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
