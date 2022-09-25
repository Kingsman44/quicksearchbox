package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.assistant.p3897e.p3921j.C51809dy;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.e */
/* compiled from: PG */
public final class C35644e extends C35614ag {

    /* renamed from: a */
    public C35606g f93507a;

    /* renamed from: b */
    public C35628au f93508b;

    /* renamed from: c */
    public Boolean f93509c;

    /* renamed from: d */
    public C35617aj f93510d;

    /* renamed from: e */
    private C51809dy f93511e;

    /* renamed from: f */
    private String f93512f;

    /* renamed from: a */
    public final C35615ah mo39741a() {
        C51809dy dyVar;
        String str;
        C35628au auVar;
        Boolean bool;
        C35617aj ajVar;
        C35606g gVar = this.f93507a;
        if (gVar != null && (dyVar = this.f93511e) != null && (str = this.f93512f) != null && (auVar = this.f93508b) != null && (bool = this.f93509c) != null && (ajVar = this.f93510d) != null) {
            return new C35645f(gVar, dyVar, str, auVar, bool, ajVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f93507a == null) {
            sb.append(" messageSnapshotCache");
        }
        if (this.f93511e == null) {
            sb.append(" clientOp");
        }
        if (this.f93512f == null) {
            sb.append(" locale");
        }
        if (this.f93508b == null) {
            sb.append(" ttsPlayer");
        }
        if (this.f93509c == null) {
            sb.append(" fallbackToOfflineIfOnlineFailed");
        }
        if (this.f93510d == null) {
            sb.append(" appFlowLogger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo39742b(C51809dy dyVar) {
        if (dyVar != null) {
            this.f93511e = dyVar;
            return;
        }
        throw new NullPointerException("Null clientOp");
    }

    /* renamed from: c */
    public final void mo39743c(String str) {
        if (str != null) {
            this.f93512f = str;
            return;
        }
        throw new NullPointerException("Null locale");
    }
}
