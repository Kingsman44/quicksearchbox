package com.google.android.libraries.appactions.serviceengine.impl;

import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3944g.p3948b.p3949a.C52951p;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.a */
/* compiled from: PG */
public final /* synthetic */ class C147891a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ExecutionAccessorImpl f398949a;

    /* renamed from: b */
    public final /* synthetic */ C52951p f398950b;

    /* renamed from: c */
    public final /* synthetic */ Iterator f398951c;

    public /* synthetic */ C147891a(ExecutionAccessorImpl executionAccessorImpl, C52951p pVar, Iterator it) {
        this.f398949a = executionAccessorImpl;
        this.f398950b = pVar;
        this.f398951c = it;
    }

    public final C60870cx apply(Object obj) {
        C52235kf kfVar = (C52235kf) obj;
        return kfVar == C52235kf.OK ? C60856cj.m92900i(kfVar) : this.f398949a.mo124566b(this.f398950b, this.f398951c);
    }
}
