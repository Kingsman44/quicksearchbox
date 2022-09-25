package com.google.android.libraries.social.populous.p3296e.p3299c;

import android.database.Cursor;
import com.google.android.libraries.social.populous.core.AutoValue_ContainerInfo;
import com.google.android.libraries.social.populous.core.C42318cq;
import com.google.android.libraries.social.populous.core.C42323cv;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.core.C42348i;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Photo;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42403a;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42417an;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42418ao;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42428g;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.social.populous.e.c.ad */
/* compiled from: PG */
final class C42453ad {

    /* renamed from: a */
    public final Set f111360a = new HashSet();

    /* renamed from: b */
    public final List f111361b = new ArrayList();

    /* renamed from: c */
    public final List f111362c = new ArrayList();

    /* renamed from: d */
    public final C42456ag f111363d;

    /* renamed from: e */
    public final C42417an f111364e;

    /* renamed from: f */
    private final String f111365f;

    public C42453ad(Cursor cursor, ClientConfigInternal clientConfigInternal, C42403a aVar) {
        long b = C42454ae.m74849b(cursor, "contact_id");
        this.f111365f = Long.toHexString(b);
        C42496w wVar = new C42496w();
        wVar.f111442a = b;
        wVar.f111448g = 1;
        String f = C42454ae.m74853f(cursor, "lookup");
        if (f != null) {
            wVar.f111443b = f;
            this.f111363d = wVar;
            C42417an c = m74846c(cursor);
            this.f111364e = c;
            ((C42428g) c).f111297c = Boolean.valueOf(C42454ae.m74854g(cursor, "starred"));
            ((C42428g) c).f111303i = Boolean.valueOf(C42454ae.m74854g(cursor, "send_to_voicemail"));
            ((C42428g) c).f111301g = Boolean.valueOf(!C42454ae.m74856i(cursor, "custom_ringtone"));
            int j = C42454ae.m74857j(cursor, "pinned");
            C42428g gVar = (C42428g) c;
            gVar.f111307m = Integer.valueOf(j);
            gVar.f111306l = Boolean.valueOf(j != 0);
            if (!C42454ae.m74856i(cursor, "photo_thumb_uri")) {
                ((C42428g) c).f111302h = true;
                C42323cv f2 = Photo.m74393f();
                f2.mo45307c(0);
                f2.mo45308d(C42454ae.m74853f(cursor, "photo_thumb_uri"));
                ((C42348i) f2).f111073b = m74845b(cursor, true);
                Photo a = f2.mo45305a();
                C42496w wVar2 = wVar;
                wVar.f111445d = a;
            } else {
                ((C42428g) c).f111302h = false;
            }
            mo45499a(cursor, clientConfigInternal, aVar);
            return;
        }
        throw new NullPointerException("Null deviceLookupKey");
    }

    /* renamed from: b */
    private final PersonFieldMetadata m74845b(Cursor cursor, boolean z) {
        boolean g = C42454ae.m74854g(cursor, "is_primary");
        C42318cq cqVar = new C42318cq();
        cqVar.f110993t = 10;
        cqVar.f110981h.add(C42331dc.DEVICE);
        cqVar.f110983j = g;
        String str = this.f111365f;
        cqVar.f110989p = str;
        cqVar.f110982i = C58485gu.m89842j(C58485gu.m89846n(new AutoValue_ContainerInfo(10, str, false)));
        cqVar.f110978e = z;
        return cqVar.mo45296a();
    }

    /* renamed from: c */
    private static final C42417an m74846c(Cursor cursor) {
        C42417an t = C42418ao.m74708t();
        t.mo45420e(C42454ae.m74848a(cursor, "times_contacted"));
        t.mo45419d(C42454ae.m74849b(cursor, "last_time_contacted"));
        C42428g gVar = (C42428g) t;
        gVar.f111295a = C42454ae.m74853f(cursor, "account_type");
        gVar.f111296b = C42454ae.m74853f(cursor, "account_name");
        t.mo45418c(C42454ae.m74857j(cursor, "times_used"));
        t.mo45417b(C42454ae.m74858k(cursor));
        gVar.f111304j = Boolean.valueOf(C42454ae.m74854g(cursor, "is_primary"));
        gVar.f111305k = Boolean.valueOf(C42454ae.m74854g(cursor, "is_super_primary"));
        return t;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45499a(android.database.Cursor r10, com.google.android.libraries.social.populous.core.ClientConfigInternal r11, com.google.android.libraries.social.populous.p3296e.p3298b.C42403a r12) {
        /*
            r9 = this;
            java.util.Set r0 = r9.f111360a
            java.lang.String r1 = "raw_contact_id"
            long r1 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74849b(r10, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            java.lang.String r0 = "mimetype"
            java.lang.String r0 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74853f(r10, r0)
            int r1 = r0.hashCode()
            r2 = 5
            r3 = 4
            r4 = 2
            r5 = 3
            r6 = 0
            r7 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            switch(r1) {
                case -1569536764: goto L_0x0059;
                case -1328682538: goto L_0x004f;
                case -1079224304: goto L_0x0045;
                case -601229436: goto L_0x003b;
                case 684173810: goto L_0x0031;
                case 2034973555: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0063
        L_0x0027:
            java.lang.String r1 = "vnd.android.cursor.item/nickname"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 4
            goto L_0x0064
        L_0x0031:
            java.lang.String r1 = "vnd.android.cursor.item/phone_v2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 1
            goto L_0x0064
        L_0x003b:
            java.lang.String r1 = "vnd.android.cursor.item/postal-address_v2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 3
            goto L_0x0064
        L_0x0045:
            java.lang.String r1 = "vnd.android.cursor.item/name"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 2
            goto L_0x0064
        L_0x004f:
            java.lang.String r1 = "vnd.android.cursor.item/contact_event"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 5
            goto L_0x0064
        L_0x0059:
            java.lang.String r1 = "vnd.android.cursor.item/email_v2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0063
            r0 = 0
            goto L_0x0064
        L_0x0063:
            r0 = -1
        L_0x0064:
            java.lang.String r1 = "data1"
            if (r0 == 0) goto L_0x0154
            if (r0 == r7) goto L_0x00f0
            java.lang.String r11 = "data2"
            if (r0 == r4) goto L_0x00a3
            if (r0 == r5) goto L_0x0096
            if (r0 == r3) goto L_0x0089
            if (r0 == r2) goto L_0x0076
            goto L_0x018e
        L_0x0076:
            int r11 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74848a(r10, r11)
            if (r11 != r5) goto L_0x018e
            boolean r10 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74856i(r10, r1)
            if (r10 != 0) goto L_0x018e
            com.google.android.libraries.social.populous.e.b.an r10 = r9.f111364e
            com.google.android.libraries.social.populous.e.b.g r10 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42428g) r10
            r10.f111300f = r8
            return
        L_0x0089:
            boolean r10 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74856i(r10, r1)
            if (r10 != 0) goto L_0x018e
            com.google.android.libraries.social.populous.e.b.an r10 = r9.f111364e
            com.google.android.libraries.social.populous.e.b.g r10 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42428g) r10
            r10.f111299e = r8
            return
        L_0x0096:
            boolean r10 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74856i(r10, r1)
            if (r10 != 0) goto L_0x018e
            com.google.android.libraries.social.populous.e.b.an r10 = r9.f111364e
            com.google.android.libraries.social.populous.e.b.g r10 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42428g) r10
            r10.f111298d = r8
            return
        L_0x00a3:
            java.lang.String r1 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74853f(r10, r1)
            java.lang.String r2 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74853f(r10, r11)
            java.lang.String r11 = "data3"
            java.lang.String r3 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74853f(r10, r11)
            boolean r11 = com.google.common.base.C58837ba.m90859h(r1)
            if (r11 != 0) goto L_0x018e
            java.lang.String r11 = "phonebook_label"
            java.lang.String r11 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74853f(r10, r11)
            java.lang.String r4 = com.google.common.base.C58837ba.m90858g(r11)
            java.util.List r11 = r9.f111362c
            if (r1 == 0) goto L_0x00e8
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r10 = r9.m74845b(r10, r6)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r10)
            boolean r12 = r12.mo56113h()
            if (r12 != 0) goto L_0x00dc
            com.google.android.libraries.social.populous.core.cq r10 = new com.google.android.libraries.social.populous.core.cq
            r10.<init>()
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r10 = r10.mo45296a()
        L_0x00dc:
            r6 = r10
            com.google.android.libraries.social.populous.e.b.b r10 = new com.google.android.libraries.social.populous.e.b.b
            r5 = 2
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.add(r10)
            return
        L_0x00e8:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "Null value"
            r10.<init>(r11)
            throw r10
        L_0x00f0:
            java.lang.String r0 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74853f(r10, r1)
            java.lang.String r1 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74859l(r10)
            e.a.a.w.a.g r2 = p5304e.p5305a.p5306a.p5442w.p5443a.C69299g.f185427a
            e.a.a.w.a.h r2 = r2.mo6453a()
            boolean r2 = r2.mo60971f()
            if (r2 == 0) goto L_0x010f
            e.a.a.w.a.g r11 = p5304e.p5305a.p5306a.p5442w.p5443a.C69299g.f185427a
            e.a.a.w.a.h r11 = r11.mo6453a()
            boolean r11 = r11.mo60973h()
            goto L_0x0111
        L_0x010f:
            boolean r11 = r11.f110719e
        L_0x0111:
            if (r11 == 0) goto L_0x0117
            java.lang.String r0 = r12.mo45392a(r0)
        L_0x0117:
            boolean r11 = com.google.common.base.C58837ba.m90859h(r1)
            if (r11 == 0) goto L_0x0121
            java.lang.String r1 = r12.mo45393b(r0)
        L_0x0121:
            boolean r11 = com.google.common.base.C58837ba.m90859h(r0)
            if (r11 != 0) goto L_0x018e
            java.util.List r11 = r9.f111361b
            com.google.android.libraries.social.populous.e.b.t r12 = com.google.android.libraries.social.populous.p3296e.p3298b.C42442u.m74821i()
            com.google.android.libraries.social.populous.core.by r2 = com.google.android.libraries.social.populous.core.C42299by.PHONE_NUMBER
            r12.mo45459e(r2)
            r12.mo45462h(r0)
            r12.mo45458d(r1)
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r0 = r9.m74845b(r10, r6)
            r1 = r12
            com.google.android.libraries.social.populous.e.b.c r1 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42424c) r1
            r1.f111272a = r0
            com.google.android.libraries.social.populous.e.b.an r10 = m74846c(r10)
            com.google.android.libraries.social.populous.e.b.ao r10 = r10.mo45416a()
            r12.mo45461g(r10)
            com.google.android.libraries.social.populous.e.b.u r10 = r12.mo45498i()
            r11.add(r10)
            return
        L_0x0154:
            java.lang.String r11 = com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae.m74853f(r10, r1)
            boolean r12 = com.google.common.base.C58837ba.m90859h(r11)
            if (r12 != 0) goto L_0x018e
            java.util.List r12 = r9.f111361b
            com.google.android.libraries.social.populous.e.b.t r0 = com.google.android.libraries.social.populous.p3296e.p3298b.C42442u.m74821i()
            com.google.android.libraries.social.populous.core.by r1 = com.google.android.libraries.social.populous.core.C42299by.EMAIL
            r0.mo45459e(r1)
            r0.mo45462h(r11)
            java.lang.String r11 = com.google.android.libraries.social.populous.core.C42290bp.m74449a(r11)
            r0.mo45458d(r11)
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r11 = r9.m74845b(r10, r6)
            r1 = r0
            com.google.android.libraries.social.populous.e.b.c r1 = (com.google.android.libraries.social.populous.p3296e.p3298b.C42424c) r1
            r1.f111272a = r11
            com.google.android.libraries.social.populous.e.b.an r10 = m74846c(r10)
            com.google.android.libraries.social.populous.e.b.ao r10 = r10.mo45416a()
            r0.mo45461g(r10)
            com.google.android.libraries.social.populous.e.b.u r10 = r0.mo45498i()
            r12.add(r10)
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.p3296e.p3299c.C42453ad.mo45499a(android.database.Cursor, com.google.android.libraries.social.populous.core.ClientConfigInternal, com.google.android.libraries.social.populous.e.b.a):void");
    }
}
