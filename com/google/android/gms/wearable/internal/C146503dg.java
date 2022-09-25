package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: com.google.android.gms.wearable.internal.dg */
/* compiled from: PG */
public final class C146503dg extends C146450bh {

    /* renamed from: a */
    public C143784ce f395697a;

    /* renamed from: b */
    public C143784ce f395698b;

    /* renamed from: c */
    public C143784ce f395699c;

    /* renamed from: d */
    public final IntentFilter[] f395700d;

    public C146503dg(IntentFilter[] intentFilterArr) {
        this.f395700d = intentFilterArr;
    }

    /* renamed from: b */
    private static void m238499b(C143784ce ceVar) {
        if (ceVar != null) {
            ceVar.f389805a = null;
            ceVar.f389806b = null;
        }
    }

    /* renamed from: a */
    public final void mo123291a() {
        m238499b(this.f395697a);
        this.f395697a = null;
        m238499b(this.f395698b);
        this.f395698b = null;
        m238499b(this.f395699c);
        this.f395699c = null;
    }

    /* renamed from: e */
    public final void mo123249e(CapabilityInfoParcelable capabilityInfoParcelable) {
        C143784ce ceVar = this.f395699c;
        if (ceVar != null) {
            ceVar.mo119235a(new C146500dd(capabilityInfoParcelable));
        }
    }

    /* renamed from: f */
    public final void mo123250f(DataHolder dataHolder) {
        C143784ce ceVar = this.f395697a;
        if (ceVar != null) {
            ceVar.mo119235a(new C146501de(dataHolder));
        } else {
            dataHolder.close();
        }
    }

    /* renamed from: g */
    public final void mo123251g(MessageEventParcelable messageEventParcelable) {
        C143784ce ceVar = this.f395698b;
        if (ceVar != null) {
            ceVar.mo119235a(new C146502df(messageEventParcelable));
        }
    }
}
