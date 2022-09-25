package com.google.assistant.p3741aa.p3742a.p3743a.p3744a;

import com.google.android.gms.usonia.p10881d.C146202f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.aa.a.a.a.v */
/* compiled from: PG */
public abstract class C48153v extends C146202f {

    /* renamed from: g */
    private static final C59071e f124593g = C59071e.m91332i("com.google.assistant.aa.a.a.a.v");

    /* renamed from: c */
    public final String mo53139c() {
        return "assistant_client.connect.TimerTrait";
    }

    /* renamed from: d */
    public final void mo53140d(C63088z zVar, long j) {
        if (j > this.f395022f) {
            try {
                this.f395021e = (C48152u) C62942bv.parseFrom((C62942bv) C48152u.f124590b, zVar);
                this.f395022f = j;
                mo106376b();
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) f124593g.mo56226d()).mo56372aa(54802)).mo56389s("Failed to parse trait proto: %s", e.getMessage());
            }
        } else {
            ((C59052c) ((C59052c) f124593g.mo56226d()).mo56372aa(54803)).mo56350C("Trait received has version mismatch. Got %s, expected %s", j, this.f395022f);
        }
    }
}
