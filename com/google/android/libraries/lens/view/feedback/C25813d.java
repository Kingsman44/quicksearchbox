package com.google.android.libraries.lens.view.feedback;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26973i;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27126ab;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.feedback.d */
/* compiled from: PG */
public final /* synthetic */ class C25813d implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ FeedbackBehavior f70146a;

    /* renamed from: b */
    public final /* synthetic */ FeedbackFooterView f70147b;

    public /* synthetic */ C25813d(FeedbackBehavior feedbackBehavior, FeedbackFooterView feedbackFooterView) {
        this.f70146a = feedbackBehavior;
        this.f70147b = feedbackFooterView;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        FeedbackBehavior feedbackBehavior = this.f70146a;
        FeedbackFooterView feedbackFooterView = this.f70147b;
        C58833ax axVar = (C58833ax) obj;
        boolean z = false;
        if (axVar.mo56113h()) {
            C26973i iVar = (C26973i) axVar.mo56107c();
            boolean z2 = iVar.mo32413d().mo56113h() && ((C27126ab) iVar.mo32413d().mo56107c()).mo32562b();
            if (!iVar.mo32425n() && !z2) {
                z = true;
            }
        }
        feedbackBehavior.f70113a = z;
        feedbackBehavior.mo30947s(feedbackFooterView);
    }
}
