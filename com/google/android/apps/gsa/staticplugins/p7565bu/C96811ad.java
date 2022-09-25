package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.common.p4522b.C58495hd;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.ad */
/* compiled from: PG */
final class C96811ad extends C96808aa {

    /* renamed from: a */
    public Date f270740a;

    /* renamed from: b */
    public Throwable f270741b;

    /* renamed from: c */
    private String f270742c;

    /* renamed from: d */
    private C58495hd f270743d;

    /* renamed from: a */
    public final C96809ab mo90352a() {
        String str;
        C58495hd hdVar;
        Date date = this.f270740a;
        if (date != null && (str = this.f270742c) != null && (hdVar = this.f270743d) != null) {
            return new C96812ae(date, str, hdVar, this.f270741b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f270740a == null) {
            sb.append(" invocationTime");
        }
        if (this.f270742c == null) {
            sb.append(" mddTaskTag");
        }
        if (this.f270743d == null) {
            sb.append(" phenotypeConfigAndClients");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo90353b(String str) {
        if (str != null) {
            this.f270742c = str;
            return;
        }
        throw new NullPointerException("Null mddTaskTag");
    }

    /* renamed from: c */
    public final void mo90354c(C58495hd hdVar) {
        if (hdVar != null) {
            this.f270743d = hdVar;
            return;
        }
        throw new NullPointerException("Null phenotypeConfigAndClients");
    }
}
