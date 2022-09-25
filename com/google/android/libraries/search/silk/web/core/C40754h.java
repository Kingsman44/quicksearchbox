package com.google.android.libraries.search.silk.web.core;

import android.util.Base64;
import com.google.android.libraries.silk.p3238b.p3239a.C41746d;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.WebConfig;
import com.google.common.p4552o.apk;
import com.google.common.util.C60789b;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56845a;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56846b;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.search.silk.web.core.h */
/* compiled from: PG */
public final class C40754h {

    /* renamed from: a */
    public final String f106855a;

    public C40754h(C43269t tVar, boolean z) {
        byte[] bArr;
        String str;
        WebConfig b = tVar.mo46384b();
        if (b.mo46299b(SilkCoreFeature.class) != null) {
            C56845a aVar = (C56845a) C56846b.f151664d.createBuilder();
            apk apk = apk.TNG;
            aVar.copyOnWrite();
            C56846b bVar = (C56846b) aVar.instance;
            bVar.f151667b = apk.f159677E;
            bVar.f151666a |= 1;
            Stream stream = Collection.EL.stream(b.f112981t);
            Class<C41746d> cls = C41746d.class;
            Objects.requireNonNull(cls);
            stream.filter(new C40750d(cls)).map(new C40751e(b)).map(C40752f.f106853a).forEach(new C40753g(aVar));
            if (((C56846b) aVar.instance).f151668c.size() != 0) {
                bArr = ((C56846b) aVar.build()).toByteArray();
            } else {
                throw new UnsupportedOperationException("This WebX instance has the SilkCoreFeature added without any SilkAPIFeature. This is not a valid WebX configuration.");
            }
        } else {
            bArr = new byte[0];
        }
        if (z) {
            str = "gzip".concat(String.valueOf(Base64.encodeToString(C60789b.m92791a(bArr, bArr.length), 11)));
        } else {
            str = Base64.encodeToString(bArr, 11);
        }
        this.f106855a = str;
    }
}
