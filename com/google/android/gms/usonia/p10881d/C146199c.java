package com.google.android.gms.usonia.p10881d;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.gms.usonia.d.c */
/* compiled from: PG */
public abstract class C146199c extends C146202f {

    /* renamed from: g */
    private static final C59071e f395015g = C59071e.m91332i("com.google.android.gms.usonia.d.c");

    /* renamed from: c */
    public final String mo53139c() {
        return "usonia.DeviceInfoTrait";
    }

    /* renamed from: d */
    public final void mo53140d(C63088z zVar, long j) {
        if (j > this.f395022f) {
            try {
                this.f395021e = (C146198b) C62942bv.parseFrom((C62942bv) C146198b.f395011c, zVar);
                this.f395022f = j;
                mo106376b();
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) f395015g.mo56226d()).mo56372aa(42072)).mo56389s("Failed to parse trait proto: %s", e.getMessage());
            }
        } else {
            ((C59052c) ((C59052c) f395015g.mo56226d()).mo56372aa(42073)).mo56350C("Trait received has version mismatch. Got %s, expected %s", j, this.f395022f);
        }
    }
}
