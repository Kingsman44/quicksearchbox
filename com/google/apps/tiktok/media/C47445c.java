package com.google.apps.tiktok.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.C5514ad;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.manager.C5976h;
import com.bumptech.glide.manager.C5987s;
import com.bumptech.glide.p287f.C5593j;

/* renamed from: com.google.apps.tiktok.media.c */
/* compiled from: PG */
public final class C47445c extends C5514ad {
    public C47445c(C5543d dVar, C5976h hVar, C5987s sVar, Context context) {
        super(dVar, hVar, sVar, context);
    }

    /* renamed from: b */
    public final /* synthetic */ C6007z mo11864b() {
        return (C47444b) super.mo11864b();
    }

    /* renamed from: c */
    public final /* synthetic */ C6007z mo11865c() {
        return mo11863a(Drawable.class);
    }

    /* renamed from: d */
    public final /* synthetic */ C6007z mo11866d() {
        return (C47444b) super.mo11866d();
    }

    /* renamed from: e */
    public final /* synthetic */ C6007z mo11867e() {
        return (C47444b) super.mo11867e();
    }

    /* renamed from: f */
    public final /* synthetic */ C6007z mo11868f(Bitmap bitmap) {
        return mo11863a(Drawable.class).mo51274ag(bitmap);
    }

    /* renamed from: g */
    public final /* synthetic */ C6007z mo11869g(Drawable drawable) {
        return mo11863a(Drawable.class).mo51275ah(drawable);
    }

    /* renamed from: h */
    public final /* synthetic */ C6007z mo11870h(Uri uri) {
        return mo11863a(Drawable.class).mo51276ai(uri);
    }

    /* renamed from: i */
    public final /* synthetic */ C6007z mo11871i(Integer num) {
        return mo11863a(Drawable.class).mo51277aj(num);
    }

    /* renamed from: j */
    public final /* synthetic */ C6007z mo11872j(Object obj) {
        return mo11863a(Drawable.class).mo51278ak(obj);
    }

    /* renamed from: k */
    public final /* synthetic */ C6007z mo11873k(String str) {
        return mo11863a(Drawable.class).mo51279al(str);
    }

    /* renamed from: l */
    public final /* synthetic */ C6007z mo11874l(byte[] bArr) {
        return mo11863a(Drawable.class).mo51280am(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo11888v(C5593j jVar) {
        if (jVar instanceof C47443a) {
            super.mo11888v(jVar);
        } else {
            super.mo11888v(new C47443a().mo51273j(jVar));
        }
    }

    /* renamed from: z */
    public final C47444b mo11863a(Class cls) {
        return new C47444b(this.f16689a, this, cls, this.f16690b);
    }
}
