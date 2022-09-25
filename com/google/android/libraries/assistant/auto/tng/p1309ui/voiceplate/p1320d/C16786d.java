package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d;

import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.apx;
import com.google.assistant.p3897e.p3921j.apy;
import com.google.protobuf.C63088z;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.d.d */
/* compiled from: PG */
public final class C16786d {

    /* renamed from: a */
    public static final Duration f49121a = Duration.ofSeconds(5);

    /* renamed from: a */
    public static C51805du m33818a(apy apy) {
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "widget.DIALOG_INFO";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.WidgetDialogInfoInput";
        C63088z byteString = apy.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("widget_dialog_info_input", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }

    /* renamed from: b */
    public static C51805du m33819b(String str, String str2, Duration duration) {
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "widget.DIALOG_INFO";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.WidgetDialogInfoInput";
        apx apx = (apx) apy.f135589f.createBuilder();
        apx.copyOnWrite();
        apy apy = (apy) apx.instance;
        str.getClass();
        apy.f135591a |= 1;
        apy.f135592b = str;
        apx.copyOnWrite();
        apy apy2 = (apy) apx.instance;
        str2.getClass();
        apy2.f135591a |= 2;
        apy2.f135593c = str2;
        long millis = duration.toMillis();
        apx.copyOnWrite();
        apy apy3 = (apy) apx.instance;
        apy3.f135591a |= 4;
        apy3.f135594d = millis;
        C63088z byteString = ((apy) apx.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("widget_dialog_info_input", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }
}
