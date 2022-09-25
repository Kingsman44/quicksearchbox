package com.google.android.libraries.elements.p1728g;

import android.content.Context;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.p293a.C5731x;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;
import com.facebook.litho.C6128bi;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6118b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21265bh;
import com.google.android.libraries.elements.interfaces.C21266bi;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import com.google.android.libraries.elements.internal.C21341b;
import com.google.android.libraries.elements.internal.C21345f;
import com.google.android.libraries.elements.p1705a.p1706a.C20682f;
import com.google.android.libraries.elements.p1714d.p1717c.C20848e;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.protos.youtube.elements.C66179cx;
import com.google.protos.youtube.elements.C66180cy;
import com.google.protos.youtube.elements.C66181cz;
import com.google.protos.youtube.elements.C66187da;
import com.google.protos.youtube.elements.C66260r;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68088j;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.elements.g.u */
/* compiled from: PG */
public final class C21193u {

    /* renamed from: a */
    public static final /* synthetic */ int f59456a = 0;

    /* renamed from: b */
    private static final C58881cr f59457b = C58886cw.m90973a(C21189q.f59443a);

    /* renamed from: a */
    protected static ImageView m39818a(Context context) {
        return new ImageView(context);
    }

    /* renamed from: b */
    public static C68088j m39819b(ImageProxy imageProxy) {
        C68044ag h = ((C20682f) imageProxy).f57965a.mo60123h();
        if (h == null || h.mo60106i() != 154604025) {
            return null;
        }
        return C68088j.m98409j(h.mo16918f(6));
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.bumptech.glide.f.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m39820c(com.facebook.litho.C6411u r12, com.facebook.litho.C6564z r13, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.ImageProxy r14, @com.facebook.litho.p323b.C6118b int r15, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21259bb r16, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.ImageProxy r17, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.ImageProxy r18, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21319z r19, @com.facebook.litho.p323b.C6118b boolean r20, com.facebook.litho.C6258fa r21, com.facebook.litho.C6258fa r22) {
        /*
            r0 = r12
            android.content.Context r1 = r0.f19009b
            com.facebook.litho.fs r2 = new com.facebook.litho.fs
            int r3 = r13.mo12882H()
            int r4 = r13.mo12901a()
            r2.<init>(r3, r4)
            r3 = r22
            r3.f18496a = r2
            int r5 = r13.mo12882H()
            int r6 = r13.mo12901a()
            r2 = r14
            r3 = r17
            r4 = r18
            r7 = r20
            com.bumptech.glide.z r1 = com.google.android.libraries.elements.p1728g.C21195w.m39830c(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x002a
            return
        L_0x002a:
            r2 = 1
            r3 = r15
            if (r3 == r2) goto L_0x002f
            goto L_0x003a
        L_0x002f:
            com.google.common.base.cr r3 = f59457b
            java.lang.Object r3 = r3.mo6453a()
            com.bumptech.glide.ae r3 = (com.bumptech.glide.C5515ae) r3
            r1.mo12452n(r3)
        L_0x003a:
            com.youtube.a.a.j r3 = m39819b(r14)
            if (r3 == 0) goto L_0x00a3
            com.youtube.a.a.i r4 = r3.mo60234i()
            if (r4 == 0) goto L_0x00a3
            com.youtube.a.a.i r3 = r3.mo60234i()
            r4 = 4
            int r5 = r3.mo16913a(r4)
            if (r5 == 0) goto L_0x005b
            java.nio.ByteBuffer r6 = r3.f24704b
            int r3 = r3.f24703a
            int r5 = r5 + r3
            float r3 = r6.getFloat(r5)
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a3
            android.content.Context r7 = r0.f19009b
            com.google.android.libraries.elements.interfaces.ContentMode r10 = r14.contentMode()
            android.content.res.Resources r0 = r7.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r11 = android.util.TypedValue.applyDimension(r2, r3, r0)
            com.google.android.libraries.elements.g.a r0 = new com.google.android.libraries.elements.g.a
            r6 = r0
            r8 = r19
            r9 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            com.bumptech.glide.f.a r0 = r1.mo11969V(r0)
            com.bumptech.glide.z r0 = (com.bumptech.glide.C6007z) r0
            com.google.android.libraries.elements.interfaces.ContentMode r1 = r14.contentMode()
            com.google.android.libraries.elements.interfaces.ContentMode r2 = com.google.android.libraries.elements.interfaces.ContentMode.CONTENT_MODE_UNKNOWN
            int r1 = r1.ordinal()
            r2 = 2
            if (r1 == r2) goto L_0x009a
            if (r1 == r4) goto L_0x0097
            com.bumptech.glide.load.c.a.v r1 = com.bumptech.glide.load.p299c.p300a.C5873v.f17472c
            goto L_0x009c
        L_0x0097:
            com.bumptech.glide.load.c.a.v r1 = com.bumptech.glide.load.p299c.p300a.C5873v.f17473d
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.c.a.v r1 = com.bumptech.glide.load.p299c.p300a.C5873v.f17470a
        L_0x009c:
            com.bumptech.glide.f.a r0 = r0.mo11949B(r1)
            r1 = r0
            com.bumptech.glide.z r1 = (com.bumptech.glide.C6007z) r1
        L_0x00a3:
            r0 = r21
            r0.f18496a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1728g.C21193u.m39820c(com.facebook.litho.u, com.facebook.litho.z, com.google.android.libraries.elements.interfaces.ImageProxy, int, com.google.android.libraries.elements.interfaces.bb, com.google.android.libraries.elements.interfaces.ImageProxy, com.google.android.libraries.elements.interfaces.ImageProxy, com.google.android.libraries.elements.interfaces.z, boolean, com.facebook.litho.fa, com.facebook.litho.fa):void");
    }

    /* renamed from: d */
    static void m39821d(C6411u uVar, @C6118b float f) {
        if (f > 0.0f) {
            C21345f fVar = new C21345f(f);
            int i = C21179g.f59406H;
            C6407q qVar = uVar.f19012e;
            String e = uVar.mo13348e();
            boolean z = qVar.f18987j;
            C6407q.m17277u("imageprefetch", fVar, qVar, e);
        }
    }

    /* renamed from: e */
    static void m39822e(C6411u uVar, ImageView imageView, @C6118b C21266bi biVar, @C6118b Boolean bool, @C6118b C21341b bVar) {
        if (biVar != null) {
            biVar.mo26753b(imageView.hashCode());
        }
        Context context = uVar.f19009b;
        if (!C21195w.m39831d(context)) {
            C5543d.m14323c(context).mo12423b(context).mo11876n(imageView);
        }
        if (bool != null && bool.booleanValue()) {
            imageView.setTag(R.id.elements_image, (Object) null);
        }
        if (bVar != null) {
            FrameSequenceDrawable frameSequenceDrawable = bVar.f59708c;
            if (frameSequenceDrawable != null) {
                frameSequenceDrawable.stop();
            }
            FrameSequenceDrawable frameSequenceDrawable2 = bVar.f59708c;
            if (frameSequenceDrawable2 != null) {
                frameSequenceDrawable2.setOnFinishedListener((FrameSequenceDrawable.OnFinishedListener) null);
            }
            bVar.f59708c = null;
        }
    }

    /* renamed from: f */
    static boolean m39823f(@C6118b C6128bi biVar, @C6118b C6128bi biVar2, @C6118b C6128bi biVar3) {
        return !Objects.equals(biVar.f18144b, biVar.f18143a) || !Objects.equals(biVar2.f18144b, biVar2.f18143a) || !Objects.equals(biVar3.f18144b, biVar3.f18143a);
    }

    /* renamed from: g */
    static void m39824g(C6007z zVar, C6276fs fsVar, @C6118b ImageProxy imageProxy) {
        String url;
        if (zVar != null) {
            C20682f fVar = (C20682f) imageProxy;
            if (!fVar.f57966b.isEmpty() && (url = ((ImageSourceProxy) fVar.f57966b.get(0)).url()) != null) {
                String scheme = C21195w.m39828a(url).getScheme();
                if (("http".equals(scheme) || "https".equals(scheme)) && fsVar.f18535a > 0 && fsVar.f18536b > 0) {
                    ((C6007z) zVar.mo11983p().mo11989z(C5731x.f17284c)).mo12456t(fsVar.f18535a, fsVar.f18536b);
                }
            }
        }
    }

    /* renamed from: h */
    protected static void m39825h(C6411u uVar, ImageView imageView, @C6118b ImageProxy imageProxy, @C6118b ImageProxy imageProxy2, @C6118b ImageProxy imageProxy3, @C6118b C21266bi biVar, @C6118b C21265bh bhVar, @C6118b Boolean bool, @C6118b C21319z zVar, @C6118b C21341b bVar, C6007z zVar2, C6276fs fsVar, @C6118b C21259bb bbVar, @C6118b C20848e eVar, @C6118b boolean z) {
        C21266bi biVar2 = biVar;
        C6007z zVar3 = zVar2;
        if (zVar3 != null) {
            C21259bb bbVar2 = bbVar;
            if (biVar2 != null) {
                biVar2.mo26757f(imageView.hashCode());
            }
            zVar3.mo12439a(new C21192t());
            if (bool == null || !bool.booleanValue()) {
                ImageView imageView2 = imageView;
            } else {
                C66179cx cxVar = (C66179cx) C66180cy.f179956b.createBuilder();
                ArrayList arrayList = ((C20682f) imageProxy).f57966b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ImageSourceProxy imageSourceProxy = (ImageSourceProxy) arrayList.get(i);
                    C66181cz czVar = (C66181cz) C66187da.f179977f.createBuilder();
                    long width = imageSourceProxy.width();
                    czVar.copyOnWrite();
                    C66187da daVar = (C66187da) czVar.instance;
                    daVar.f179979a |= 8;
                    daVar.f179982d = (int) width;
                    long height = imageSourceProxy.height();
                    czVar.copyOnWrite();
                    C66187da daVar2 = (C66187da) czVar.instance;
                    daVar2.f179979a |= 16;
                    daVar2.f179983e = (int) height;
                    if (imageSourceProxy.url() != null) {
                        String url = imageSourceProxy.url();
                        czVar.copyOnWrite();
                        C66187da daVar3 = (C66187da) czVar.instance;
                        url.getClass();
                        daVar3.f179980b = 1;
                        daVar3.f179981c = url;
                    }
                    cxVar.mo59444a(czVar);
                }
                ImageView imageView3 = imageView;
                imageView.setTag(R.id.elements_image, (C66180cy) cxVar.build());
            }
            zVar3.mo12455s(new C21191s(fsVar, imageView, imageProxy, biVar, bhVar, imageProxy2, imageProxy3, bVar, bbVar, eVar), (C5592i) null, zVar3, C5622i.f16959a);
        } else if (z && !C21195w.m39831d(uVar.f19009b)) {
            bbVar.mo25782a(C66260r.LOG_TYPE_MISSING_FIELD, "Failed to find a valid source for the image. Sources: " + ((C20682f) imageProxy).f57966b.size() + ". Please make sure image source array is not empty and each image source has proper remote url / client resource name / serialized image data.", zVar, (Throwable) null);
        }
    }
}
