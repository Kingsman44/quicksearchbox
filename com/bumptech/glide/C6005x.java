package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.load.p297b.C5750ab;
import com.bumptech.glide.p282c.p284b.C5540l;
import com.bumptech.glide.p282c.p284b.C5541m;
import com.bumptech.glide.p285d.C5544a;
import com.google.apps.tiktok.media.contrib.cronet.C47446a;
import com.google.apps.tiktok.media.contrib.cronet.C47447b;
import com.google.apps.tiktok.media.contrib.cronet.TikTokCronetGlideModule;
import dagger.hilt.C68286a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bumptech.glide.x */
/* compiled from: PG */
final class C6005x {
    /* renamed from: a */
    public static void m15437a(Context context, C5543d dVar, C6003v vVar, List list, C5544a aVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TikTokCronetGlideModule tikTokCronetGlideModule = (TikTokCronetGlideModule) it.next();
            try {
                C47447b du = ((C47446a) C68286a.m98629a(context, C47446a.class)).mo51282du();
                vVar.f17680a.mo12275e(C5750ab.class, InputStream.class, new C5541m(du));
                vVar.f17680a.mo12274d(C5750ab.class, ByteBuffer.class, new C5540l(du));
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(tikTokCronetGlideModule.getClass().getName())), e);
            }
        }
        if (aVar != null) {
            aVar.mo11837d(context, dVar, vVar);
        }
    }
}
