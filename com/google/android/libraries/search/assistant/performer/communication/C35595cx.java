package com.google.android.libraries.search.assistant.performer.communication;

import android.location.Location;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52542vp;
import com.google.assistant.p3897e.p3921j.C52543vq;
import com.google.assistant.p3897e.p3921j.C52544vr;
import com.google.assistant.p3897e.p3921j.C52545vs;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cx */
/* compiled from: PG */
public final /* synthetic */ class C35595cx implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C35595cx f93431a = new C35595cx();

    private /* synthetic */ C35595cx() {
    }

    public final Object apply(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        C59071e eVar = C35666da.f93543a;
        if (axVar.mo56113h()) {
            Location location = (Location) axVar.mo56107c();
            if (!(location.getProvider() == null || !location.hasAccuracy() || location.getTime() == 0 || location.getElapsedRealtimeNanos() == 0)) {
                Location location2 = (Location) axVar.mo56107c();
                C52542vp vpVar = (C52542vp) C52545vs.f137919b.createBuilder();
                C52543vq vqVar = (C52543vq) C52544vr.f137915c.createBuilder();
                double latitude = location2.getLatitude();
                vqVar.copyOnWrite();
                ((C52544vr) vqVar.instance).f137917a = latitude;
                double longitude = location2.getLongitude();
                vqVar.copyOnWrite();
                ((C52544vr) vqVar.instance).f137918b = longitude;
                C52544vr vrVar = (C52544vr) vqVar.build();
                vpVar.copyOnWrite();
                vrVar.getClass();
                ((C52545vs) vpVar.instance).f137921a = vrVar;
                C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
                kbVar.copyOnWrite();
                C52232kc kcVar = (C52232kc) kbVar.instance;
                kcVar.f137064a |= 1;
                kcVar.f137065b = "location_result";
                C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                C63088z byteString = ((C52545vs) vpVar.build()).toByteString();
                jzVar.copyOnWrite();
                C52230ka kaVar = (C52230ka) jzVar.instance;
                byteString.getClass();
                kaVar.f137059a |= 2;
                kaVar.f137061c = byteString;
                jzVar.copyOnWrite();
                C52230ka kaVar2 = (C52230ka) jzVar.instance;
                kaVar2.f137059a |= 1;
                kaVar2.f137060b = "assistant.api.client_op.LocationResult";
                C52230ka kaVar3 = (C52230ka) jzVar.build();
                kbVar.copyOnWrite();
                C52232kc kcVar2 = (C52232kc) kbVar.instance;
                kaVar3.getClass();
                kcVar2.f137066c = kaVar3;
                kcVar2.f137064a |= 2;
                C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
                C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
                C52235kf kfVar = C52235kf.OK;
                kdVar.copyOnWrite();
                C52236kg kgVar = (C52236kg) kdVar.instance;
                kgVar.f137092b = kfVar.f137088t;
                kgVar.f137091a |= 1;
                dzVar.copyOnWrite();
                C52070ec ecVar = (C52070ec) dzVar.instance;
                C52236kg kgVar2 = (C52236kg) kdVar.build();
                kgVar2.getClass();
                ecVar.f136654b = kgVar2;
                ecVar.f136653a |= 1;
                C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
                eaVar.mo53780b((C52232kc) kbVar.build());
                C52069eb ebVar = (C52069eb) eaVar.build();
                dzVar.copyOnWrite();
                C52070ec ecVar2 = (C52070ec) dzVar.instance;
                ebVar.getClass();
                ecVar2.f136655c = ebVar;
                ecVar2.f136653a |= 2;
                return (C52070ec) dzVar.build();
            }
        }
        return C36180b.m64579c(C52235kf.NOT_FOUND, "Location could not be found");
    }
}
