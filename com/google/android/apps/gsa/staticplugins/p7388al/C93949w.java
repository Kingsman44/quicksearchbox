package com.google.android.apps.gsa.staticplugins.p7388al;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83919f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.w */
/* compiled from: PG */
public final class C93949w extends C83870ad implements C83956t {

    /* renamed from: b */
    private static final C59071e f262366b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.al.w");

    /* renamed from: a */
    public C93943q f262367a;

    /* renamed from: c */
    private final C83919f f262368c;

    /* renamed from: d */
    private C93924aa f262369d;

    /* renamed from: e */
    private int f262370e = 1;

    public C93949w(C83919f fVar) {
        this.f262368c = fVar;
    }

    /* renamed from: a */
    private final C58833ax m154992a() {
        this.f262370e = 2;
        this.f262367a = new C93943q();
        Bundle bundle = new Bundle();
        ProtoParsers.m95532o(bundle, "DeviceScanConfig", this.f262368c);
        return C58833ax.m90834k(C83875ai.m133540e(this.f262367a, bundle));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        C59052c cVar = (C59052c) ((C59052c) f262366b.mo56224b()).mo56372aa(19358);
        int i = this.f262370e;
        int i2 = i - 1;
        if (i != 0) {
            cVar.mo56387q("#getNextDelegate currentState %d", i2);
            int i3 = this.f262370e;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == 0) {
                return m154992a();
            } else {
                if (i4 != 1) {
                    if (i4 == 2) {
                        return m154992a();
                    }
                    throw new IllegalArgumentException("Unknown State.");
                } else if (this.f262367a.f262354z.f228573b.size() != 0) {
                    return C58836b.f156633a;
                } else {
                    this.f262370e = 3;
                    this.f262369d = new C93924aa();
                    Bundle bundle = new Bundle();
                    bundle.putString("WifiName", this.f262367a.f262328A);
                    bundle.putBoolean("is_in_custodio_flow", this.f262367a.mo88225k());
                    return C58833ax.m90834k(C83875ai.m133540e(this.f262369d, bundle));
                }
            }
        } else {
            throw null;
        }
    }
}
