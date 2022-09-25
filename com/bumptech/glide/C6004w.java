package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.data.C5940o;
import com.bumptech.glide.load.data.C5943r;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p297b.C5750ab;
import com.bumptech.glide.load.p297b.C5756ah;
import com.bumptech.glide.load.p297b.C5774az;
import com.bumptech.glide.load.p297b.C5775b;
import com.bumptech.glide.load.p297b.C5776ba;
import com.bumptech.glide.load.p297b.C5777bb;
import com.bumptech.glide.load.p297b.C5778bc;
import com.bumptech.glide.load.p297b.C5780be;
import com.bumptech.glide.load.p297b.C5781bf;
import com.bumptech.glide.load.p297b.C5782bg;
import com.bumptech.glide.load.p297b.C5783bh;
import com.bumptech.glide.load.p297b.C5785bj;
import com.bumptech.glide.load.p297b.C5788bm;
import com.bumptech.glide.load.p297b.C5789bn;
import com.bumptech.glide.load.p297b.C5791bp;
import com.bumptech.glide.load.p297b.C5793br;
import com.bumptech.glide.load.p297b.C5795c;
import com.bumptech.glide.load.p297b.C5798f;
import com.bumptech.glide.load.p297b.C5802j;
import com.bumptech.glide.load.p297b.C5804l;
import com.bumptech.glide.load.p297b.C5806n;
import com.bumptech.glide.load.p297b.C5810r;
import com.bumptech.glide.load.p297b.C5814v;
import com.bumptech.glide.load.p297b.C5818z;
import com.bumptech.glide.load.p297b.p298a.C5736a;
import com.bumptech.glide.load.p297b.p298a.C5738c;
import com.bumptech.glide.load.p297b.p298a.C5740e;
import com.bumptech.glide.load.p297b.p298a.C5743h;
import com.bumptech.glide.load.p297b.p298a.C5744i;
import com.bumptech.glide.load.p297b.p298a.C5747l;
import com.bumptech.glide.load.p299c.p300a.C5821a;
import com.bumptech.glide.load.p299c.p300a.C5824ac;
import com.bumptech.glide.load.p299c.p300a.C5831aj;
import com.bumptech.glide.load.p299c.p300a.C5833al;
import com.bumptech.glide.load.p299c.p300a.C5836ao;
import com.bumptech.glide.load.p299c.p300a.C5839ar;
import com.bumptech.glide.load.p299c.p300a.C5843av;
import com.bumptech.glide.load.p299c.p300a.C5846ay;
import com.bumptech.glide.load.p299c.p300a.C5848b;
import com.bumptech.glide.load.p299c.p300a.C5849ba;
import com.bumptech.glide.load.p299c.p300a.C5851bc;
import com.bumptech.glide.load.p299c.p300a.C5853be;
import com.bumptech.glide.load.p299c.p300a.C5854c;
import com.bumptech.glide.load.p299c.p300a.C5858g;
import com.bumptech.glide.load.p299c.p300a.C5859h;
import com.bumptech.glide.load.p299c.p300a.C5868q;
import com.bumptech.glide.load.p299c.p300a.C5876y;
import com.bumptech.glide.load.p299c.p301b.C5879a;
import com.bumptech.glide.load.p299c.p302c.C5884b;
import com.bumptech.glide.load.p299c.p302c.C5885c;
import com.bumptech.glide.load.p299c.p302c.C5886d;
import com.bumptech.glide.load.p299c.p302c.C5891i;
import com.bumptech.glide.load.p299c.p302c.C5892j;
import com.bumptech.glide.load.p299c.p303d.C5894a;
import com.bumptech.glide.load.p299c.p304e.C5897b;
import com.bumptech.glide.load.p299c.p304e.C5900e;
import com.bumptech.glide.load.p299c.p304e.C5901f;
import com.bumptech.glide.load.p299c.p304e.C5908m;
import com.bumptech.glide.load.p299c.p304e.C5910o;
import com.bumptech.glide.load.p299c.p305f.C5911a;
import com.bumptech.glide.load.p299c.p305f.C5912b;
import com.bumptech.glide.load.p299c.p305f.C5913c;
import com.bumptech.glide.load.p299c.p305f.C5914d;
import com.bumptech.glide.p281b.C5517a;
import com.bumptech.glide.p285d.C5544a;
import com.bumptech.glide.p291h.C5624k;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.w */
/* compiled from: PG */
final class C6004w implements C5624k {

    /* renamed from: a */
    final /* synthetic */ C5543d f17690a;

    /* renamed from: b */
    final /* synthetic */ List f17691b;

    /* renamed from: c */
    final /* synthetic */ C5544a f17692c;

    /* renamed from: d */
    private boolean f17693d;

    public C6004w(C5543d dVar, List list, C5544a aVar) {
        this.f17690a = dVar;
        this.f17691b = list;
        this.f17692c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12074a() {
        C5962u uVar;
        C5962u uVar2;
        Class<byte[]> cls = byte[].class;
        if (!this.f17693d) {
            this.f17693d = true;
            Trace.beginSection("Glide registry");
            try {
                C5543d dVar = this.f17690a;
                List list = this.f17691b;
                C5544a aVar = this.f17692c;
                C5642d dVar2 = dVar.f16788a;
                C5640b bVar = dVar.f16790c;
                Context applicationContext = dVar.f16789b.getApplicationContext();
                C5996o oVar = dVar.f16789b.f16998g;
                C6003v vVar = new C6003v();
                vVar.f17686g.mo11939b(new C5868q());
                vVar.f17686g.mo11939b(new C5824ac());
                Resources resources = applicationContext.getResources();
                List a = vVar.mo12438a();
                C5897b bVar2 = new C5897b(applicationContext, a, dVar2, bVar);
                C5543d dVar3 = dVar;
                List list2 = list;
                C5853be beVar = new C5853be(dVar2, new C5851bc());
                C5544a aVar2 = aVar;
                Class<byte[]> cls2 = cls;
                C5876y yVar = new C5876y(vVar.mo12438a(), resources.getDisplayMetrics(), dVar2, bVar);
                if (oVar.mo12437a(C5597g.class)) {
                    uVar2 = new C5831aj();
                    uVar = new C5859h();
                } else {
                    uVar = new C5858g(yVar);
                    uVar2 = new C5839ar(yVar, bVar);
                }
                String str = "legacy_append";
                C5897b bVar3 = bVar2;
                String str2 = "BitmapDrawable";
                C5885c cVar = new C5885c(new C5886d(a, bVar));
                vVar.f17682c.mo11943c("Animation", cVar, InputStream.class, Drawable.class);
                C5884b bVar4 = new C5884b(new C5886d(a, bVar));
                vVar.f17682c.mo11943c("Animation", bVar4, ByteBuffer.class, Drawable.class);
                C5891i iVar = new C5891i(applicationContext);
                C5777bb bbVar = new C5777bb(resources);
                C5778bc bcVar = new C5778bc(resources);
                C5776ba baVar = new C5776ba(resources);
                C5778bc bcVar2 = bcVar;
                C5774az azVar = new C5774az(resources);
                C5854c cVar2 = new C5854c(bVar);
                C5776ba baVar2 = baVar;
                C5911a aVar3 = new C5911a();
                C5914d dVar4 = new C5914d();
                ContentResolver contentResolver = applicationContext.getContentResolver();
                Context context = applicationContext;
                C5777bb bbVar2 = bbVar;
                vVar.f17681b.mo11937b(ByteBuffer.class, new C5804l());
                vVar.f17681b.mo11937b(InputStream.class, new C5780be(bVar));
                vVar.f17682c.mo11943c("Bitmap", uVar, ByteBuffer.class, Bitmap.class);
                vVar.f17682c.mo11943c("Bitmap", uVar2, InputStream.class, Bitmap.class);
                if (ParcelFileDescriptorRewinder.m15281c()) {
                    vVar.f17682c.mo11943c("Bitmap", new C5833al(yVar), ParcelFileDescriptor.class, Bitmap.class);
                }
                vVar.f17682c.mo11943c("Bitmap", beVar, ParcelFileDescriptor.class, Bitmap.class);
                C5853be beVar2 = new C5853be(dVar2, new C5846ay());
                vVar.f17682c.mo11943c("Bitmap", beVar2, AssetFileDescriptor.class, Bitmap.class);
                C5785bj bjVar = C5785bj.f17378a;
                vVar.f17680a.mo12273c(Bitmap.class, Bitmap.class, bjVar);
                vVar.f17682c.mo11943c("Bitmap", new C5843av(), Bitmap.class, Bitmap.class);
                vVar.f17683d.mo11947b(Bitmap.class, cVar2);
                String str3 = str2;
                vVar.f17682c.mo11943c(str3, new C5821a(resources, uVar), ByteBuffer.class, BitmapDrawable.class);
                vVar.f17682c.mo11943c(str3, new C5821a(resources, uVar2), InputStream.class, BitmapDrawable.class);
                vVar.f17682c.mo11943c(str3, new C5821a(resources, beVar), ParcelFileDescriptor.class, BitmapDrawable.class);
                vVar.f17683d.mo11947b(BitmapDrawable.class, new C5848b(dVar2, cVar2));
                C5897b bVar5 = bVar3;
                vVar.f17682c.mo11943c("Animation", new C5910o(a, bVar5, bVar), InputStream.class, C5900e.class);
                vVar.f17682c.mo11943c("Animation", bVar5, ByteBuffer.class, C5900e.class);
                vVar.f17683d.mo11947b(C5900e.class, new C5901f());
                C5785bj bjVar2 = C5785bj.f17378a;
                vVar.f17680a.mo12273c(C5517a.class, C5517a.class, bjVar2);
                vVar.f17682c.mo11943c("Bitmap", new C5908m(dVar2), C5517a.class, Bitmap.class);
                String str4 = str;
                vVar.f17682c.mo11943c(str4, iVar, Uri.class, Drawable.class);
                vVar.f17682c.mo11943c(str4, new C5836ao(iVar, dVar2), Uri.class, Bitmap.class);
                vVar.f17684e.mo12388b(new C5879a());
                vVar.f17680a.mo12273c(File.class, ByteBuffer.class, new C5806n());
                vVar.f17680a.mo12273c(File.class, InputStream.class, new C5818z());
                vVar.f17682c.mo11943c(str4, new C5894a(), File.class, File.class);
                vVar.f17680a.mo12273c(File.class, ParcelFileDescriptor.class, new C5814v());
                C5785bj bjVar3 = C5785bj.f17378a;
                vVar.f17680a.mo12273c(File.class, File.class, bjVar3);
                vVar.f17684e.mo12388b(new C5940o(bVar));
                if (ParcelFileDescriptorRewinder.m15281c()) {
                    vVar.f17684e.mo12388b(new C5943r());
                }
                C5777bb bbVar3 = bbVar2;
                vVar.f17680a.mo12273c(Integer.TYPE, InputStream.class, bbVar3);
                C5776ba baVar3 = baVar2;
                vVar.f17680a.mo12273c(Integer.TYPE, ParcelFileDescriptor.class, baVar3);
                vVar.f17680a.mo12273c(Integer.class, InputStream.class, bbVar3);
                vVar.f17680a.mo12273c(Integer.class, ParcelFileDescriptor.class, baVar3);
                C5778bc bcVar3 = bcVar2;
                vVar.f17680a.mo12273c(Integer.class, Uri.class, bcVar3);
                C5774az azVar2 = azVar;
                vVar.f17680a.mo12273c(Integer.TYPE, AssetFileDescriptor.class, azVar2);
                vVar.f17680a.mo12273c(Integer.class, AssetFileDescriptor.class, azVar2);
                vVar.f17680a.mo12273c(Integer.TYPE, Uri.class, bcVar3);
                vVar.f17680a.mo12273c(String.class, InputStream.class, new C5810r());
                vVar.f17680a.mo12273c(Uri.class, InputStream.class, new C5810r());
                vVar.f17680a.mo12273c(String.class, InputStream.class, new C5783bh());
                vVar.f17680a.mo12273c(String.class, ParcelFileDescriptor.class, new C5782bg());
                vVar.f17680a.mo12273c(String.class, AssetFileDescriptor.class, new C5781bf());
                vVar.f17680a.mo12273c(Uri.class, InputStream.class, new C5795c(context.getAssets()));
                vVar.f17680a.mo12273c(Uri.class, AssetFileDescriptor.class, new C5775b(context.getAssets()));
                Context context2 = context;
                vVar.f17680a.mo12273c(Uri.class, InputStream.class, new C5738c(context2));
                vVar.f17680a.mo12273c(Uri.class, InputStream.class, new C5740e(context2));
                vVar.f17680a.mo12273c(Uri.class, InputStream.class, new C5744i(context2));
                vVar.f17680a.mo12273c(Uri.class, ParcelFileDescriptor.class, new C5743h(context2));
                ContentResolver contentResolver2 = contentResolver;
                vVar.f17680a.mo12273c(Uri.class, InputStream.class, new C5791bp(contentResolver2));
                vVar.f17680a.mo12273c(Uri.class, ParcelFileDescriptor.class, new C5789bn(contentResolver2));
                vVar.f17680a.mo12273c(Uri.class, AssetFileDescriptor.class, new C5788bm(contentResolver2));
                vVar.f17680a.mo12273c(Uri.class, InputStream.class, new C5793br());
                vVar.f17680a.mo12273c(URL.class, InputStream.class, new C5747l());
                vVar.f17680a.mo12273c(Uri.class, File.class, new C5756ah(context2));
                vVar.f17680a.mo12273c(C5750ab.class, InputStream.class, new C5736a());
                Class<byte[]> cls3 = cls2;
                vVar.f17680a.mo12273c(cls3, ByteBuffer.class, new C5798f());
                vVar.f17680a.mo12273c(cls3, InputStream.class, new C5802j());
                C5785bj bjVar4 = C5785bj.f17378a;
                vVar.f17680a.mo12273c(Uri.class, Uri.class, bjVar4);
                C5785bj bjVar5 = C5785bj.f17378a;
                vVar.f17680a.mo12273c(Drawable.class, Drawable.class, bjVar5);
                vVar.f17682c.mo11943c(str4, new C5892j(), Drawable.class, Drawable.class);
                vVar.f17685f.mo12375c(Bitmap.class, BitmapDrawable.class, new C5912b(resources));
                C5911a aVar4 = aVar3;
                vVar.f17685f.mo12375c(Bitmap.class, cls3, aVar4);
                C5914d dVar5 = dVar4;
                vVar.f17685f.mo12375c(Drawable.class, cls3, new C5913c(dVar2, aVar4, dVar5));
                vVar.f17685f.mo12375c(C5900e.class, cls3, dVar5);
                C5853be beVar3 = new C5853be(dVar2, new C5849ba());
                vVar.f17682c.mo11943c(str4, beVar3, ByteBuffer.class, Bitmap.class);
                vVar.f17682c.mo11943c(str4, new C5821a(resources, beVar3), ByteBuffer.class, BitmapDrawable.class);
                C6005x.m15437a(context2, dVar3, vVar, list2, aVar2);
                return vVar;
            } finally {
                Trace.endSection();
            }
        } else {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
    }
}
