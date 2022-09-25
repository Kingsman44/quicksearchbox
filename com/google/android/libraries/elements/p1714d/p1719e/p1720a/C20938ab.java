package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.protos.youtube.elements.C66200dn;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70112k;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.d.e.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C20938ab implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C66200dn f58714a;

    /* renamed from: b */
    public final /* synthetic */ C21313t f58715b;

    /* renamed from: c */
    public final /* synthetic */ C21311r f58716c;

    public /* synthetic */ C20938ab(C66200dn dnVar, C21313t tVar, C21311r rVar) {
        this.f58714a = dnVar;
        this.f58715b = tVar;
        this.f58716c = rVar;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        C66200dn dnVar = this.f58714a;
        C21313t tVar = this.f58715b;
        C21311r rVar = this.f58716c;
        if (((C70112k) obj).f186864b == null) {
            if ((dnVar.f180017a & 4) != 0) {
                CommandOuterClass$Command commandOuterClass$Command = dnVar.f180020d;
                if (commandOuterClass$Command == null) {
                    commandOuterClass$Command = CommandOuterClass$Command.f179510a;
                }
                return tVar.mo26125b(commandOuterClass$Command, rVar, 1);
            }
            C69794a aVar = C69874i.f186267a;
            C69822d dVar = C70101a.f186847o;
            return aVar;
        } else if ((dnVar.f180017a & 8) != 0) {
            CommandOuterClass$Command commandOuterClass$Command2 = dnVar.f180021e;
            if (commandOuterClass$Command2 == null) {
                commandOuterClass$Command2 = CommandOuterClass$Command.f179510a;
            }
            return tVar.mo26125b(commandOuterClass$Command2, rVar, 1);
        } else {
            C69794a aVar2 = C69874i.f186267a;
            C69822d dVar2 = C70101a.f186847o;
            return aVar2;
        }
    }
}
