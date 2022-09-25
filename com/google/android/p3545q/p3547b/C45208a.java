package com.google.android.p3545q.p3547b;

import android.net.Uri;
import java.io.InputStream;
import java.net.URL;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.q.b.a */
/* compiled from: PG */
final class C45208a extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C45211d f117971a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45208a(C45211d dVar) {
        super(0);
        this.f117971a = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        InputStream inputStream;
        URL url = this.f117971a.f117980f;
        if ((url != null && (inputStream = url.openStream()) != null) || (inputStream = this.f117971a.f117979e.getContentResolver().openInputStream(this.f117971a.f117978d)) != null) {
            return inputStream;
        }
        Uri uri = this.f117971a.f117978d;
        throw new IllegalArgumentException("Can't read URI '" + uri + "'");
    }
}
