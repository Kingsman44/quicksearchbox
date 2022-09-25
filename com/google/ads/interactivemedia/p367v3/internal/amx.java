package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import com.google.ads.interactivemedia.p367v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p367v3.api.UiElement;
import com.google.ads.interactivemedia.p367v3.impl.data.C6740bf;
import com.google.ads.interactivemedia.p367v3.impl.data.C6751bq;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amx */
/* compiled from: PG */
public final class amx {

    /* renamed from: a */
    private static final age f21000a;

    /* renamed from: b */
    private final amv f21001b;

    /* renamed from: c */
    private final Object f21002c;

    /* renamed from: d */
    private final String f21003d;

    /* renamed from: e */
    private final amw f21004e;

    static {
        agf agf = new agf();
        agf.mo14714b(UiElement.class, C6751bq.GSON_TYPE_ADAPTER);
        agf.mo14714b(CompanionAdSlot.class, new amu());
        agf.mo14715c(new apt());
        f21000a = agf.mo14713a();
    }

    public amx(amv amv, amw amw, String str) {
        this(amv, amw, str, (Object) null);
    }

    public amx(amv amv, amw amw, String str, Object obj) {
        this.f21001b = amv;
        this.f21004e = amw;
        this.f21003d = str;
        this.f21002c = obj;
    }

    /* renamed from: a */
    public static amx m19012a(String str) {
        Uri parse = Uri.parse(str);
        String substring = parse.getPath().substring(1);
        if (parse.getQueryParameter("sid") != null) {
            amv valueOf = amv.valueOf(substring);
            amw valueOf2 = amw.valueOf(parse.getQueryParameter("type"));
            String queryParameter = parse.getQueryParameter("sid");
            age age = f21000a;
            String queryParameter2 = parse.getQueryParameter("data");
            Class<C6740bf> cls = C6740bf.class;
            return new amx(valueOf, valueOf2, queryParameter, aie.m18764b(cls).cast(queryParameter2 == null ? null : age.mo14710h(new StringReader(queryParameter2), cls)));
        }
        throw new MalformedURLException("Session id must be provided in message.");
    }

    /* renamed from: b */
    public final amv mo14981b() {
        return this.f21001b;
    }

    /* renamed from: c */
    public final amw mo14982c() {
        return this.f21004e;
    }

    /* renamed from: d */
    public final Object mo14983d() {
        return this.f21002c;
    }

    /* renamed from: e */
    public final String mo14984e() {
        return this.f21003d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof amx)) {
            return false;
        }
        amx amx = (amx) obj;
        return this.f21001b == amx.f21001b && apz.m19253b(this.f21002c, amx.f21002c) && apz.m19253b(this.f21003d, amx.f21003d) && this.f21004e == amx.f21004e;
    }

    /* renamed from: f */
    public final String mo14986f() {
        arq arq = new arq();
        arq.mo15311b("type", this.f21004e);
        arq.mo15311b("sid", this.f21003d);
        Object obj = this.f21002c;
        if (obj != null) {
            arq.mo15311b("data", obj);
        }
        return String.format("%s('%s', %s);", new Object[]{"javascript:adsense.mobileads.afmanotify.receiveMessage", this.f21001b, f21000a.mo14707e(arq.mo15310a())});
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21001b, this.f21002c, this.f21003d, this.f21004e});
    }

    public final String toString() {
        return String.format("JavaScriptMessage [command=%s, type=%s, sid=%s, data=%s]", new Object[]{this.f21001b, this.f21004e, this.f21003d, this.f21002c});
    }
}
