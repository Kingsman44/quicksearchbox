package com.google.ads.interactivemedia.p367v3.internal;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aiu */
/* compiled from: PG */
public final class aiu extends ald {

    /* renamed from: a */
    private static final Writer f20716a = new ait();

    /* renamed from: b */
    private static final ago f20717b = new ago("closed");

    /* renamed from: c */
    private final List f20718c = new ArrayList();

    /* renamed from: d */
    private String f20719d;

    /* renamed from: e */
    private agj f20720e = agl.f20627a;

    public aiu() {
        super(f20716a);
    }

    /* renamed from: s */
    private final agj m18800s() {
        List list = this.f20718c;
        return (agj) list.get(list.size() - 1);
    }

    /* renamed from: t */
    private final void m18801t(agj agj) {
        if (this.f20719d != null) {
            if (!(agj instanceof agl) || mo14902r()) {
                ((agm) m18800s()).mo14726a(this.f20719d, agj);
            }
            this.f20719d = null;
        } else if (this.f20718c.isEmpty()) {
            this.f20720e = agj;
        } else {
            agj s = m18800s();
            if (s instanceof agh) {
                ((agh) s).mo14718a(agj);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final agj mo14843a() {
        if (this.f20718c.isEmpty()) {
            return this.f20720e;
        }
        StringBuilder sb = new StringBuilder("Expected one JSON element but was ");
        List list = this.f20718c;
        sb.append(list);
        throw new IllegalStateException("Expected one JSON element but was ".concat(String.valueOf(list)));
    }

    /* renamed from: b */
    public final void mo14844b() {
        agh agh = new agh();
        m18801t(agh);
        this.f20718c.add(agh);
    }

    /* renamed from: c */
    public final void mo14845c() {
        agm agm = new agm();
        m18801t(agm);
        this.f20718c.add(agm);
    }

    public final void close() {
        if (this.f20718c.isEmpty()) {
            this.f20718c.add(f20717b);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public final void mo14847d() {
        if (this.f20718c.isEmpty() || this.f20719d != null) {
            throw new IllegalStateException();
        } else if (m18800s() instanceof agh) {
            List list = this.f20718c;
            list.remove(list.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public final void mo14848e() {
        if (this.f20718c.isEmpty() || this.f20719d != null) {
            throw new IllegalStateException();
        } else if (m18800s() instanceof agm) {
            List list = this.f20718c;
            list.remove(list.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public final void mo14849f(String str) {
        if (this.f20718c.isEmpty() || this.f20719d != null) {
            throw new IllegalStateException();
        } else if (m18800s() instanceof agm) {
            this.f20719d = str;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void flush() {
    }

    /* renamed from: g */
    public final void mo14851g() {
        m18801t(agl.f20627a);
    }

    /* renamed from: h */
    public final void mo14852h(long j) {
        m18801t(new ago((Number) Long.valueOf(j)));
    }

    /* renamed from: i */
    public final void mo14853i(Boolean bool) {
        if (bool == null) {
            mo14851g();
        } else {
            m18801t(new ago(bool));
        }
    }

    /* renamed from: j */
    public final void mo14854j(Number number) {
        if (number == null) {
            mo14851g();
            return;
        }
        if (!mo14898n()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                new StringBuilder("JSON forbids NaN and infinities: ").append(number);
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(number.toString()));
            }
        }
        m18801t(new ago(number));
    }

    /* renamed from: k */
    public final void mo14855k(String str) {
        if (str == null) {
            mo14851g();
        } else {
            m18801t(new ago(str));
        }
    }

    /* renamed from: l */
    public final void mo14856l(boolean z) {
        m18801t(new ago(Boolean.valueOf(z)));
    }
}
