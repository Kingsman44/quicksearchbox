package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.internal.C21325ae;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.C66204dr;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import dagger.C68214a;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.d.e.a.ai */
/* compiled from: PG */
public final class C20945ai implements C21312s {

    /* renamed from: a */
    private final C68214a f58731a;

    public C20945ai(C68214a aVar) {
        this.f58731a = aVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66204dr.f180029d;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        boolean contains;
        C66204dr drVar = (C66204dr) obj;
        C21313t tVar = (C21313t) this.f58731a.mo27525b();
        if (drVar.f180031a.length() > 0) {
            String str = drVar.f180031a;
            synchronized (C21325ae.f59685a) {
                contains = C21325ae.f59685a.contains(str);
            }
            if (contains) {
                C69794a aVar = C69874i.f186267a;
                C69822d dVar = C70101a.f186847o;
                return aVar;
            }
        }
        String str2 = drVar.f180031a;
        synchronized (C21325ae.f59685a) {
            C21325ae.f59685a.add(str2);
        }
        CommandOuterClass$Command commandOuterClass$Command = drVar.f180032b;
        if (commandOuterClass$Command == null) {
            commandOuterClass$Command = CommandOuterClass$Command.f179510a;
        }
        return tVar.mo26125b(commandOuterClass$Command, rVar, 1);
    }
}
