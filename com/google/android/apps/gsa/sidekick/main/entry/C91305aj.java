package com.google.android.apps.gsa.sidekick.main.entry;

import android.content.Context;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.sidekick.main.notifications.C91502aq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7713he;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7874nd;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.aj */
/* compiled from: PG */
public final class C91305aj extends C91330bh {

    /* renamed from: b */
    private static final C59071e f254817b = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.entry.aj");

    /* renamed from: c */
    private final C89911f f254818c;

    public C91305aj(Context context, C89911f fVar) {
        super(context);
        this.f254818c = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Boolean mo85583a(C7718hj hjVar, Void voidR) {
        int a = C7713he.m22812a(hjVar.f26985z);
        if (a != 0 && a == 4) {
            return true;
        }
        return super.mo85588l(hjVar, voidR);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Boolean mo85584b(C7718hj hjVar, List list, Void voidR) {
        int a = C7713he.m22812a(hjVar.f26985z);
        if (a != 0 && a == 4) {
            return true;
        }
        return super.mo85585d(hjVar, list, voidR);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo85585d(C7718hj hjVar, List list, Object obj) {
        return mo85585d(hjVar, list, (Void) obj);
    }

    /* renamed from: e */
    public final boolean mo85586e(C7718hj hjVar) {
        int a;
        C7746ik a2 = C7746ik.m22834a(hjVar.f26966g);
        if (a2 == null) {
            a2 = C7746ik.UNKNOWN;
        }
        if (a2 == C7746ik.UNKNOWN || (a = C7713he.m22812a(hjVar.f26985z)) == 0 || a != 4) {
            return super.mo85586e(hjVar);
        }
        C7874nd ndVar = hjVar.f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        if (!C91502aq.m149665c(ndVar)) {
            ((C59052c) ((C59052c) f254817b.mo56226d()).mo56372aa(11553)).mo56386p("Notification dropped because it's not valid.");
            return false;
        } else if ((ndVar.f27589a & 65536) != 0) {
            return true;
        } else {
            ((C59052c) ((C59052c) f254817b.mo56226d()).mo56372aa(11552)).mo56386p("Notification dropped because no ContentAction provided.");
            this.f254818c.mo83755a((Throwable) null, 178710667, 29).mo83721a();
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo85587f(C7718hj hjVar, List list) {
        int a;
        if (hjVar != null) {
            C7746ik a2 = C7746ik.m22834a(hjVar.f26966g);
            if (a2 == null) {
                a2 = C7746ik.UNKNOWN;
            }
            if (!(a2 == C7746ik.UNKNOWN || (a = C7713he.m22812a(hjVar.f26985z)) == 0 || a != 4)) {
                return true;
            }
        }
        return super.mo85587f(hjVar, list);
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Object mo85588l(C7718hj hjVar, Object obj) {
        return mo85588l(hjVar, (Void) obj);
    }
}
