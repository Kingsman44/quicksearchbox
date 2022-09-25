package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.v */
/* compiled from: PG */
public final class C61979v extends C61959do {

    /* renamed from: a */
    public String f167509a;

    /* renamed from: b */
    public ParcelFileDescriptor f167510b;

    /* renamed from: c */
    public ParcelFileDescriptor f167511c;

    /* renamed from: d */
    private ParcelFileDescriptor f167512d;

    /* renamed from: e */
    private ParcelFileDescriptor f167513e;

    /* renamed from: a */
    public final ParcelFileDescriptor mo58422a() {
        ParcelFileDescriptor parcelFileDescriptor = this.f167513e;
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor;
        }
        throw new IllegalStateException("Property \"metadataTable\" has not been set");
    }

    /* renamed from: b */
    public final ParcelFileDescriptor mo58423b() {
        ParcelFileDescriptor parcelFileDescriptor = this.f167512d;
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor;
        }
        throw new IllegalStateException("Property \"namesTable\" has not been set");
    }

    /* renamed from: c */
    public final C61960dp mo58424c() {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        String str = this.f167509a;
        if (str != null && (parcelFileDescriptor = this.f167512d) != null && (parcelFileDescriptor2 = this.f167513e) != null) {
            return new C61980w(str, parcelFileDescriptor, parcelFileDescriptor2, this.f167510b, this.f167511c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f167509a == null) {
            sb.append(" sliceId");
        }
        if (this.f167512d == null) {
            sb.append(" namesTable");
        }
        if (this.f167513e == null) {
            sb.append(" metadataTable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final String mo58425d() {
        String str = this.f167509a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"sliceId\" has not been set");
    }

    /* renamed from: e */
    public final void mo58426e(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            this.f167513e = parcelFileDescriptor;
            return;
        }
        throw new NullPointerException("Null metadataTable");
    }

    /* renamed from: f */
    public final void mo58427f(ParcelFileDescriptor parcelFileDescriptor) {
        this.f167510b = parcelFileDescriptor;
    }

    /* renamed from: g */
    public final void mo58428g(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            this.f167512d = parcelFileDescriptor;
            return;
        }
        throw new NullPointerException("Null namesTable");
    }

    /* renamed from: h */
    public final void mo58429h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f167511c = parcelFileDescriptor;
    }
}
