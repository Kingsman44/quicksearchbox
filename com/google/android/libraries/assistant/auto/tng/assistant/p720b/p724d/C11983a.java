package com.google.android.libraries.assistant.auto.tng.assistant.p720b.p724d;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.b.d.a */
/* compiled from: PG */
public final class C11983a {

    /* renamed from: a */
    private final C28443m f38491a;

    public C11983a(C28443m mVar) {
        this.f38491a = mVar;
    }

    /* renamed from: a */
    public final C51805du mo20350a(C51803ds dsVar, View view) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "logs.ClickTrackingCGI";
        C63088z byteString = this.f38491a.mo33851a(C28485y.m53234a(view)).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("click_tracking_cgi_params", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }
}
