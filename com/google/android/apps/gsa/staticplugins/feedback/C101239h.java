package com.google.android.apps.gsa.staticplugins.feedback;

import android.os.RemoteException;
import com.google.android.apps.gsa.search.shared.multiuser.C87608k;
import com.google.android.apps.gsa.search.shared.multiuser.C87613p;
import com.google.android.apps.gsa.search.shared.multiuser.C87615r;
import com.google.android.apps.gsa.search.shared.multiuser.C87616s;
import com.google.android.apps.gsa.search.shared.multiuser.C87618u;
import com.google.android.apps.gsa.shared.util.debug.FeedbackData;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.h */
/* compiled from: PG */
public final /* synthetic */ class C101239h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C101246o f282527a;

    /* renamed from: b */
    public final /* synthetic */ FeedbackData f282528b;

    /* renamed from: c */
    public final /* synthetic */ boolean f282529c;

    /* renamed from: d */
    public final /* synthetic */ boolean f282530d;

    public /* synthetic */ C101239h(C101246o oVar, FeedbackData feedbackData, boolean z, boolean z2) {
        this.f282527a = oVar;
        this.f282528b = feedbackData;
        this.f282529c = z;
        this.f282530d = z2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C87616s sVar;
        C101246o oVar = this.f282527a;
        FeedbackData feedbackData = this.f282528b;
        boolean z = this.f282529c;
        boolean z2 = this.f282530d;
        if (((Boolean) obj).booleanValue()) {
            try {
                C87618u uVar = oVar.f282546G;
                sVar = new C87616s(uVar);
                if (sVar.mo81749b()) {
                    C87615r rVar = new C87615r(sVar);
                    C87613p a = uVar.mo81753a();
                    if (a != null) {
                        C58976aa aaVar = C58975e.f156826a;
                        a.mo81746a(new C87608k(feedbackData), rVar);
                    } else {
                        throw new RemoteException("Not connected");
                    }
                }
            } catch (RemoteException | RuntimeException e) {
                sVar.mo81748a();
                throw e;
            } catch (RemoteException e2) {
                C59104x c = C101246o.f282539z.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SendGoogleFeedback");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(19917)).mo56386p("Exception while reading work profile accounts");
            }
        } else {
            oVar.mo92192j(feedbackData, z, z2);
        }
        return Void.TYPE;
    }
}
