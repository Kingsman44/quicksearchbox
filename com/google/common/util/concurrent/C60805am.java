package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* renamed from: com.google.common.util.concurrent.am */
/* compiled from: PG */
final class C60805am implements Callable {

    /* renamed from: a */
    final /* synthetic */ C60809aq f164862a;

    /* renamed from: b */
    final /* synthetic */ C60811as f164863b;

    public C60805am(C60811as asVar, C60809aq aqVar) {
        this.f164863b = asVar;
        this.f164862a = aqVar;
    }

    public final Object call() {
        C60813au auVar = new C60813au(this.f164863b.f164870b);
        C60809aq aqVar = this.f164862a;
        C60802aj ajVar = this.f164863b.f164869a;
        auVar.f164873a = true;
        C60802aj ajVar2 = new C60802aj();
        try {
            return aqVar.mo51504a(auVar);
        } finally {
            ajVar.mo57261b(ajVar2, C60826bg.f164896a);
            auVar.f164873a = false;
        }
    }

    public final String toString() {
        return this.f164862a.toString();
    }
}
