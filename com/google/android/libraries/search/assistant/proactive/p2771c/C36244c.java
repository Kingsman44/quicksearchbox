package com.google.android.libraries.search.assistant.proactive.p2771c;

import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.proactive.c.c */
/* compiled from: PG */
public final /* synthetic */ class C36244c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C36245d f94675a;

    /* renamed from: b */
    public final /* synthetic */ String f94676b = "asst.dialog.state.params";

    public /* synthetic */ C36244c(C36245d dVar) {
        this.f94675a = dVar;
    }

    public final Object call() {
        C36245d dVar = this.f94675a;
        String str = this.f94676b;
        for (C52232kc kcVar : dVar.f94679c.f136712a) {
            if (kcVar.f137065b.equals(str)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                return Optional.m71637of(kaVar);
            }
        }
        return Optional.empty();
    }
}
