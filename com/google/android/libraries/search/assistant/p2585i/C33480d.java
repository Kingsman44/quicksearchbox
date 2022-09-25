package com.google.android.libraries.search.assistant.p2585i;

import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.i.d */
/* compiled from: PG */
public final class C33480d {

    /* renamed from: a */
    public final String f89601a;

    /* renamed from: b */
    public final C33476a f89602b;

    private C33480d(String str, C33476a aVar) {
        this.f89601a = str;
        this.f89602b = aVar;
    }

    /* renamed from: a */
    public static C33480d m62053a(String str, String str2, MessageLite messageLite) {
        return new C33480d(str, new C33476a(str2, messageLite));
    }

    /* renamed from: b */
    public final C52232kc mo38881b(MessageLite messageLite) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        String str = this.f89601a;
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
        C52230ka a = this.f89602b.mo38879a(messageLite);
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        a.getClass();
        kcVar2.f137066c = a;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }

    /* renamed from: c */
    public final MessageLite mo38882c(List list) {
        Optional e = mo38884e(list);
        C33476a aVar = this.f89602b;
        Objects.requireNonNull(aVar);
        return (MessageLite) e.orElseGet(new C33479c(aVar));
    }

    /* renamed from: d */
    public final MessageLite mo38883d(List list) {
        try {
            return (MessageLite) mo38884e(list).orElseThrow(new C33478b(this));
        } catch (C62974ct e) {
            throw new IllegalArgumentException("Could not parse: ".concat(this.f89601a), e);
        }
    }

    /* renamed from: e */
    public final Optional mo38884e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C52232kc kcVar = (C52232kc) it.next();
            if (kcVar.f137065b.equals(this.f89601a)) {
                C33476a aVar = this.f89602b;
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                return Optional.m71637of(aVar.mo38880b(kaVar));
            }
        }
        return Optional.empty();
    }
}
