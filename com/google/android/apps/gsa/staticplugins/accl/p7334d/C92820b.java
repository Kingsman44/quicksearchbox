package com.google.android.apps.gsa.staticplugins.accl.p7334d;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.C1791ah;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6491a.C84347af;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1310a.p1311a.C16618c;
import com.google.assistant.p3897e.p3921j.ach;
import com.google.assistant.p3897e.p3921j.ack;
import com.google.assistant.p3897e.p3921j.acl;
import com.google.assistant.p3897e.p3921j.acm;
import com.google.assistant.p3897e.p3921j.acn;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63041ff;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.d.b */
/* compiled from: PG */
public final class C92820b implements C84347af {

    /* renamed from: a */
    private final Context f259003a;

    /* renamed from: b */
    private final C86124t f259004b;

    /* renamed from: c */
    private final C16618c f259005c;

    public C92820b(Context context, C16618c cVar, C86124t tVar) {
        this.f259003a = context;
        this.f259005c = cVar;
        this.f259004b = tVar;
    }

    /* renamed from: a */
    public final List mo77883a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            aco d = mo87468d((BundledMessageNotification) list.get(i), i, z, BuildConfig.FLAVOR);
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final aco mo77884b(BundledMessageNotification bundledMessageNotification, boolean z) {
        return mo87468d(bundledMessageNotification, 0, z, BuildConfig.FLAVOR);
    }

    /* renamed from: c */
    public final C60870cx mo77885c(BundledMessageNotification bundledMessageNotification, boolean z) {
        Icon a;
        Notification b = bundledMessageNotification.mo84111b();
        if (C1791ah.m4935c(b)) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C60870cx i = C60856cj.m92900i(BuildConfig.FLAVOR);
        if (this.f259004b.mo79746e(C90086ek.f250329bA) && (a = C90366ae.m146962a(b, this.f259003a)) != null) {
            i = this.f259005c.mo22933a(a, this.f259003a);
        }
        return C60922j.m93044g(i, new C92819a(this, bundledMessageNotification, z), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final aco mo87468d(BundledMessageNotification bundledMessageNotification, int i, boolean z, String str) {
        String str2;
        Uri uri;
        String str3;
        byte[] bArr = null;
        if (this.f259004b.mo79746e(C90025cd.f248140D)) {
            if (bundledMessageNotification.mo84112c() != null) {
                MessageNotification c = bundledMessageNotification.mo84112c();
                c.getClass();
                if (c.f252537G) {
                    return null;
                }
            }
        } else if (C1791ah.m4935c(bundledMessageNotification.mo84111b())) {
            return null;
        }
        ach ach = (ach) aco.f134821t.createBuilder();
        ach.copyOnWrite();
        aco aco = (aco) ach.instance;
        aco.f134823a |= 1;
        aco.f134824b = i;
        String obj = bundledMessageNotification.mo84116f().toString();
        ach.copyOnWrite();
        aco aco2 = (aco) ach.instance;
        obj.getClass();
        aco2.f134823a |= 2;
        aco2.f134825c = obj;
        String g = bundledMessageNotification.mo84117g();
        ach.copyOnWrite();
        aco aco3 = (aco) ach.instance;
        aco3.f134823a |= 8;
        aco3.f134827e = g;
        String j = bundledMessageNotification.mo84120j();
        ach.copyOnWrite();
        aco aco4 = (aco) ach.instance;
        aco4.f134823a |= 16;
        aco4.f134828f = j;
        long a = bundledMessageNotification.mo84110a();
        ach.copyOnWrite();
        aco aco5 = (aco) ach.instance;
        aco5.f134823a |= 32;
        aco5.f134829g = a;
        String h = bundledMessageNotification.mo84118h();
        ach.copyOnWrite();
        aco aco6 = (aco) ach.instance;
        aco6.f134823a |= 64;
        aco6.f134830h = h.length();
        MessageNotification c2 = bundledMessageNotification.mo84112c();
        if (c2 == null || (str2 = c2.f252545v) == null) {
            str2 = BuildConfig.FLAVOR;
        }
        ach.copyOnWrite();
        aco aco7 = (aco) ach.instance;
        str2.getClass();
        aco7.f134823a |= 8192;
        aco7.f134836n = str2;
        MessageNotification c3 = bundledMessageNotification.mo84112c();
        if (c3 == null || (uri = c3.f252546w) == null) {
            uri = Uri.EMPTY;
        }
        String uri2 = uri.toString();
        ach.copyOnWrite();
        aco aco8 = (aco) ach.instance;
        uri2.getClass();
        aco8.f134823a |= 4096;
        aco8.f134835m = uri2;
        boolean n = bundledMessageNotification.mo84124n();
        ach.copyOnWrite();
        aco aco9 = (aco) ach.instance;
        aco9.f134823a |= 512;
        aco9.f134833k = n;
        if (!str.isEmpty()) {
            ach.copyOnWrite();
            aco aco10 = (aco) ach.instance;
            str.getClass();
            aco10.f134823a |= C89885b.S3REQUEST_VALUE;
            aco10.f134841s = str;
        }
        MessageNotification c4 = bundledMessageNotification.mo84112c();
        String str4 = c4 == null ? null : c4.f252538H;
        if (str4 != null) {
            ach.copyOnWrite();
            aco aco11 = (aco) ach.instance;
            aco11.f134823a |= 16384;
            aco11.f134837o = str4;
        }
        MessageNotification c5 = bundledMessageNotification.mo84112c();
        String str5 = c5 == null ? null : c5.f252539I;
        if (str5 != null) {
            ach.copyOnWrite();
            aco aco12 = (aco) ach.instance;
            aco12.f134823a |= 32768;
            aco12.f134838p = str5;
        }
        MessageNotification c6 = bundledMessageNotification.mo84112c();
        if (c6 != null) {
            bArr = c6.f252540J;
        }
        if (bArr != null) {
            C63088z A = C63088z.m96139A(bArr);
            ach.copyOnWrite();
            aco aco13 = (aco) ach.instance;
            aco13.f134823a |= 65536;
            aco13.f134839q = A;
        }
        C58485gu d = bundledMessageNotification.mo84113d();
        int size = d.size();
        for (int i2 = 0; i2 < size; i2++) {
            MessageNotification messageNotification = (MessageNotification) d.get(i2);
            ack ack = (ack) acl.f134809g.createBuilder();
            acm acm = (acm) acn.f134817c.createBuilder();
            String obj2 = messageNotification.f252535E.toString();
            acm.copyOnWrite();
            acn acn = (acn) acm.instance;
            obj2.getClass();
            acn.f134819a |= 2;
            acn.f134820b = obj2;
            ack.copyOnWrite();
            acl acl = (acl) ack.instance;
            acn acn2 = (acn) acm.build();
            acn2.getClass();
            acl.f134813c = acn2;
            acl.f134811a |= 2;
            String g2 = C58837ba.m90858g(messageNotification.f252545v);
            ack.copyOnWrite();
            acl acl2 = (acl) ack.instance;
            acl2.f134811a |= 8;
            acl2.f134815e = g2;
            Uri uri3 = messageNotification.f252546w;
            String uri4 = uri3 == null ? BuildConfig.FLAVOR : uri3.toString();
            ack.copyOnWrite();
            acl acl3 = (acl) ack.instance;
            uri4.getClass();
            acl3.f134811a |= 16;
            acl3.f134816f = uri4;
            C63041ff ffVar = (C63041ff) C63042fg.f170152c.createBuilder();
            long j2 = messageNotification.f252592m;
            ffVar.copyOnWrite();
            ((C63042fg) ffVar.instance).f170154a = j2;
            ack.copyOnWrite();
            acl acl4 = (acl) ack.instance;
            C63042fg fgVar = (C63042fg) ffVar.build();
            fgVar.getClass();
            acl4.f134812b = fgVar;
            acl4.f134811a |= 1;
            if (z) {
                CharSequence charSequence = messageNotification.f252543t;
                String obj3 = charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
                ack.copyOnWrite();
                acl acl5 = (acl) ack.instance;
                obj3.getClass();
                acl5.f134811a |= 4;
                acl5.f134814d = obj3;
            }
            ach.mo53672a(ack);
        }
        String i3 = bundledMessageNotification.mo84119i();
        if (i3 != null) {
            ach.copyOnWrite();
            aco aco14 = (aco) ach.instance;
            aco14.f134823a |= 2048;
            aco14.f134834l = i3;
        }
        if (bundledMessageNotification.mo84123m()) {
            CharSequence e = bundledMessageNotification.mo84115e();
            ach.copyOnWrite();
            aco aco15 = (aco) ach.instance;
            aco15.f134831i = 2;
            aco15.f134823a |= 128;
            if (TextUtils.isEmpty(e)) {
                str3 = this.f259003a.getString(R.string.default_group_name);
            } else {
                str3 = e.toString();
            }
            ach.copyOnWrite();
            aco aco16 = (aco) ach.instance;
            str3.getClass();
            aco16.f134823a |= 256;
            aco16.f134832j = str3;
        }
        return (aco) ach.build();
    }
}
