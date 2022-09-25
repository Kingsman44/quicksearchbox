package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.p031v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.C43027d;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43056e;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56544ca;
import com.google.p4281bu.p4282a.C56589o;
import com.google.p4281bu.p4282a.C56590p;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68353ab;

/* compiled from: PG */
public class SurveyViewPager extends ViewPager {
    public SurveyViewPager(Context context) {
        super(context);
        m76022E();
    }

    /* renamed from: D */
    private final View m76021D() {
        C43071a y;
        if (mo9126b() == null || (y = mo46117y()) == null) {
            return null;
        }
        return y.getView();
    }

    /* renamed from: E */
    private final void m76022E() {
        C43135cj cjVar = new C43135cj(this);
        mo9137f(cjVar);
        post(new C43134ci(this, cjVar));
    }

    /* renamed from: A */
    public final void mo46114A() {
        mo9148m(mo9126b().mo9175k() - 1, true);
        mo46117y().mo46121d();
    }

    /* renamed from: B */
    public final boolean mo46115B() {
        return mo9122a() == 0;
    }

    /* renamed from: C */
    public final boolean mo46116C() {
        C43136ck ckVar = (C43136ck) mo9126b();
        if (ckVar == null) {
            Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
            return false;
        } else if (C43054c.m75958a() && mo46117y() != null && ckVar.mo46201q(mo9122a()).f151001i != null) {
            C56544ca caVar = ((C43136ck) mo9126b()).mo46201q(mo9122a()).f151001i;
            if (caVar == null) {
                caVar = C56544ca.f150987c;
            }
            C56590p pVar = caVar.f150990b;
            if (pVar == null) {
                pVar = C56590p.f151086c;
            }
            int a = C56589o.m88216a(pVar.f151088a);
            if (a == 0 || a != 5) {
                return false;
            }
            return true;
        } else if (C43054c.m75960c(C68353ab.m98708c(C43054c.f112610b))) {
            if (mo9122a() == ckVar.mo9175k() - (ckVar.f112818d == C43027d.CARD ? 2 : 1)) {
                return true;
            }
            return false;
        } else if (mo9122a() == ckVar.mo9175k() - 2) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
            default:
                switch (keyCode) {
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                        return false;
                    default:
                        return super.dispatchKeyEvent(keyEvent);
                }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (!C43054c.m75960c(C68353ab.f184693a.mo6453a().mo60345a(C43054c.f112610b))) {
            if (getChildCount() == 0) {
                super.onMeasure(i, i2);
            }
            View D = m76021D();
            if (D == null) {
                super.onMeasure(i, i2);
                return;
            }
            D.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = D.getMeasuredHeight();
            Rect rect = new Rect();
            D.getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            int height2 = D.findViewById(R.id.survey_question_header_logo_text).getHeight();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.survey_card_vertical_margin);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(measuredHeight, (height - height2) - (dimensionPixelSize + dimensionPixelSize)), 1073741824));
            return;
        }
        View D2 = m76021D();
        if (D2 == null) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, C43056e.m75961a(this, D2, i, i2, D2.findViewById(R.id.survey_question_header_logo_text), ((C43130ce) getContext()).mo46109v().findViewById(R.id.survey_controls_container)));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: y */
    public final C43071a mo46117y() {
        Context context = getContext();
        if (!(context instanceof C43130ce)) {
            Log.e("SurveyViewPager", "Context is not a SurveyPromptActivity, something is very wrong.");
            return null;
        }
        int a = mo9122a();
        for (Fragment fragment : ((C43130ce) context).mo46183jw().f634a.mo677i()) {
            if (C43136ck.m76111o(fragment) == a && (fragment instanceof C43071a)) {
                return (C43071a) fragment;
            }
        }
        return null;
    }

    /* renamed from: z */
    public final C56517ba mo46118z() {
        C43071a y = mo46117y();
        if (y == null) {
            return null;
        }
        return y.mo46120c();
    }

    public SurveyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m76022E();
    }
}
