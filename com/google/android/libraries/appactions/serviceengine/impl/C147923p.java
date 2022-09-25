package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.Intent;
import com.google.assistant.p3944g.p3948b.p3949a.C52943h;
import com.google.assistant.p3944g.p3948b.p3949a.C52948m;
import com.google.assistant.p3944g.p3948b.p3949a.C52949n;
import com.google.assistant.p3944g.p3948b.p3949a.C52950o;
import com.google.assistant.p3944g.p3948b.p3949a.C52951p;
import com.google.assistant.p3944g.p3948b.p3949a.C52956u;
import com.google.assistant.p3944g.p3948b.p3949a.C52957v;
import com.google.assistant.p3944g.p3948b.p3949a.C52958w;
import com.google.assistant.p3944g.p3948b.p3949a.C52960y;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.p */
/* compiled from: PG */
public final /* synthetic */ class C147923p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147923p f399002a = new C147923p();

    private /* synthetic */ C147923p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52956u uVar = (C52956u) C52957v.f138849e.createBuilder();
        C52958w wVar = (C52958w) C52960y.f138856c.createBuilder();
        wVar.copyOnWrite();
        C52960y yVar = (C52960y) wVar.instance;
        yVar.f138859b = 1;
        yVar.f138858a |= 1;
        uVar.copyOnWrite();
        C52957v vVar = (C52957v) uVar.instance;
        C52960y yVar2 = (C52960y) wVar.build();
        yVar2.getClass();
        vVar.f138852b = yVar2;
        vVar.f138851a |= 1;
        C52950o oVar = (C52950o) C52951p.f138834f.createBuilder();
        C52948m mVar = (C52948m) C52949n.f138829c.createBuilder();
        String uri = ((Intent) obj).toUri(0);
        mVar.copyOnWrite();
        C52949n nVar = (C52949n) mVar.instance;
        uri.getClass();
        nVar.f138831a |= 1;
        nVar.f138832b = uri;
        oVar.copyOnWrite();
        C52951p pVar = (C52951p) oVar.instance;
        C52949n nVar2 = (C52949n) mVar.build();
        nVar2.getClass();
        pVar.f138837b = nVar2;
        pVar.f138836a |= 1;
        oVar.mo53953a(C52943h.EXECUTION_MODE_ANDROID_INTENT);
        uVar.copyOnWrite();
        C52957v vVar2 = (C52957v) uVar.instance;
        C52951p pVar2 = (C52951p) oVar.build();
        pVar2.getClass();
        vVar2.f138854d = pVar2;
        vVar2.f138851a |= 8;
        return (C52957v) uVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
