package com.google.android.apps.gsa.shared.bisto.p7028a;

import android.util.Base64;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124642bh;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124726x;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124727y;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bt */
/* compiled from: PG */
final class C89481bt implements C89482bu {

    /* renamed from: a */
    final String f242508a;

    /* renamed from: b */
    final String f242509b;

    /* renamed from: c */
    final long f242510c;

    /* renamed from: d */
    C124709g f242511d;

    public C89481bt(String str, String str2, long j, C124709g gVar) {
        this.f242508a = str;
        this.f242509b = str2;
        this.f242510c = j;
        this.f242511d = gVar;
    }

    /* renamed from: e */
    public final String mo83424e() {
        C124727y yVar = this.f242511d.f344056f;
        if (yVar == null) {
            yVar = C124727y.f344118c;
        }
        if ((yVar.f344120a & 1) != 0) {
            C124708f fVar = (C124708f) this.f242511d.toBuilder();
            C124727y yVar2 = this.f242511d.f344056f;
            if (yVar2 == null) {
                yVar2 = C124727y.f344118c;
            }
            C124726x xVar = (C124726x) yVar2.toBuilder();
            C63088z zVar = C63088z.f170246b;
            xVar.copyOnWrite();
            C124727y yVar3 = (C124727y) xVar.instance;
            zVar.getClass();
            yVar3.f344120a |= 1;
            yVar3.f344121b = zVar;
            fVar.copyOnWrite();
            C124709g gVar = (C124709g) fVar.instance;
            C124727y yVar4 = (C124727y) xVar.build();
            yVar4.getClass();
            gVar.f344056f = yVar4;
            gVar.f344051a |= 16;
            this.f242511d = (C124709g) fVar.build();
        }
        String str = this.f242508a;
        String str2 = this.f242509b;
        long j = this.f242510c;
        C124642bh bhVar = this.f242511d.f344054d;
        if (bhVar == null) {
            bhVar = C124642bh.f343852o;
        }
        C124715m a = C124715m.m204378a(bhVar.f343856c);
        if (a == null) {
            a = C124715m.UNKNOWN_CONNECTIVITY_STATUS;
        }
        int i = a.f344081h;
        C124644bj bjVar = this.f242511d.f344053c;
        if (bjVar == null) {
            bjVar = C124644bj.f343868n;
        }
        C124636bb a2 = C124636bb.m204301a(bjVar.f343875f);
        if (a2 == null) {
            a2 = C124636bb.UNKNOWN_ENABLED_STATE;
        }
        int i2 = a2.f343849e;
        C124623ap apVar = this.f242511d.f344052b;
        if (apVar == null) {
            apVar = C124623ap.f343769w;
        }
        C124633az a3 = C124633az.m204299a(apVar.f343772b);
        if (a3 == null) {
            a3 = C124633az.OOBE_STATE_UNKNOWN;
        }
        return "BDI: deviceId=" + str + ", modelId=" + str2 + ", time=" + j + ", connectivity status=" + i + ", opa enabled=" + i2 + ", oobe state=" + a3.f343841h + ", device info=" + Base64.encodeToString(this.f242511d.toByteArray(), 10);
    }

    public final String toString() {
        return mo83424e();
    }
}
