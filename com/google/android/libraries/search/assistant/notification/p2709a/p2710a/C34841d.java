package com.google.android.libraries.search.assistant.notification.p2709a.p2710a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.android.libraries.search.assistant.notification.data.p2713a.C34877e;
import com.google.android.libraries.search.assistant.notification.data.p2713a.C34878f;
import com.google.android.libraries.search.assistant.notification.data.p2713a.C34879g;
import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.ach;
import com.google.assistant.p3897e.p3921j.ack;
import com.google.assistant.p3897e.p3921j.acl;
import com.google.assistant.p3897e.p3921j.acm;
import com.google.assistant.p3897e.p3921j.acn;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.a.a.d */
/* compiled from: PG */
public final class C34841d implements C34837a {

    /* renamed from: a */
    private static final C59071e f92410a = C59071e.m91332i("com.google.android.libraries.search.assistant.notification.a.a.d");

    /* renamed from: b */
    private final Context f92411b;

    /* renamed from: c */
    private final Executor f92412c;

    public C34841d(Context context, Executor executor) {
        this.f92411b = context;
        this.f92412c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20103a(BundledMessageNotification bundledMessageNotification, int i, boolean z) {
        boolean z2;
        String str;
        C59104x b = f92410a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MsgNotifConv");
        ((C59052c) ((C59052c) b).mo56372aa(51445)).mo56386p("#convertBundledMessageNotification");
        Optional c = C34879g.m63709c(bundledMessageNotification);
        if (!c.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        MessageNotification messageNotification = (MessageNotification) c.get();
        ach ach = (ach) aco.f134821t.createBuilder();
        ach.copyOnWrite();
        aco aco = (aco) ach.instance;
        aco.f134823a |= 1;
        aco.f134824b = i;
        acm acm = (acm) acn.f134817c.createBuilder();
        String obj = messageNotification.mo39562s().toString();
        acm.copyOnWrite();
        acn acn = (acn) acm.instance;
        obj.getClass();
        acn.f134819a |= 2;
        acn.f134820b = obj;
        ach.copyOnWrite();
        aco aco2 = (aco) ach.instance;
        acn acn2 = (acn) acm.build();
        acn2.getClass();
        aco2.f134826d = acn2;
        aco2.f134823a |= 4;
        String obj2 = messageNotification.mo39562s().toString();
        ach.copyOnWrite();
        aco aco3 = (aco) ach.instance;
        obj2.getClass();
        aco3.f134823a |= 2;
        aco3.f134825c = obj2;
        String t = messageNotification.mo39563t();
        ach.copyOnWrite();
        aco aco4 = (aco) ach.instance;
        t.getClass();
        aco4.f134823a |= 8;
        aco4.f134827e = t;
        String v = messageNotification.mo39566v();
        ach.copyOnWrite();
        aco aco5 = (aco) ach.instance;
        v.getClass();
        aco5.f134823a |= 16;
        aco5.f134828f = v;
        int sum = Collection.EL.stream(bundledMessageNotification.mo39538a()).filter(C34877e.f92511a).mapToInt(C34878f.f92512a).sum();
        ach.copyOnWrite();
        aco aco6 = (aco) ach.instance;
        aco6.f134823a |= 64;
        aco6.f134830h = sum;
        Optional c2 = messageNotification.mo39544c();
        if (c2.isPresent() && ((MessageNotification.Actions) c2.get()).mo39569b().isPresent() && ((MessageNotification.Actions) c2.get()).mo39570c().isPresent()) {
            z2 = true;
        } else {
            z2 = false;
        }
        ach.copyOnWrite();
        aco aco7 = (aco) ach.instance;
        aco7.f134823a |= 512;
        aco7.f134833k = z2;
        if (messageNotification.mo39561r().isPresent()) {
            long longValue = ((Long) messageNotification.mo39561r().get()).longValue();
            ach.copyOnWrite();
            aco aco8 = (aco) ach.instance;
            aco8.f134823a |= 32;
            aco8.f134829g = longValue;
        }
        if (messageNotification.mo39558o().isPresent()) {
            String str2 = (String) messageNotification.mo39558o().get();
            ach.copyOnWrite();
            aco aco9 = (aco) ach.instance;
            str2.getClass();
            aco9.f134823a |= 8192;
            aco9.f134836n = str2;
        }
        if (messageNotification.mo39552i().isPresent()) {
            String uri = ((Uri) messageNotification.mo39552i().get()).toString();
            ach.copyOnWrite();
            aco aco10 = (aco) ach.instance;
            uri.getClass();
            aco10.f134823a |= 4096;
            aco10.f134835m = uri;
        }
        if (messageNotification.mo39553j().isPresent()) {
            String str3 = (String) messageNotification.mo39553j().get();
            ach.copyOnWrite();
            aco aco11 = (aco) ach.instance;
            str3.getClass();
            aco11.f134823a |= 16384;
            aco11.f134837o = str3;
        }
        if (messageNotification.mo39555l().isPresent()) {
            String str4 = (String) messageNotification.mo39555l().get();
            ach.copyOnWrite();
            aco aco12 = (aco) ach.instance;
            str4.getClass();
            aco12.f134823a |= 32768;
            aco12.f134838p = str4;
        }
        if (messageNotification.mo39560q().isPresent()) {
            C63088z A = C63088z.m96139A((byte[]) messageNotification.mo39560q().get());
            ach.copyOnWrite();
            aco aco13 = (aco) ach.instance;
            aco13.f134823a |= 65536;
            aco13.f134839q = A;
        }
        if (messageNotification.mo39558o().isPresent() && (((String) messageNotification.mo39558o().get()).equals("broadcast/assistant_server_audio") || ((String) messageNotification.mo39558o().get()).equals("family_broadcast/assistant_server_audio"))) {
            ach.copyOnWrite();
            aco aco14 = (aco) ach.instance;
            aco14.f134823a |= 512;
            aco14.f134833k = true;
        }
        C58485gu a = bundledMessageNotification.mo39538a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            MessageNotification messageNotification2 = (MessageNotification) a.get(i2);
            ack ack = (ack) acl.f134809g.createBuilder();
            acm acm2 = (acm) acn.f134817c.createBuilder();
            String obj3 = messageNotification2.mo39562s().toString();
            acm2.copyOnWrite();
            acn acn3 = (acn) acm2.instance;
            obj3.getClass();
            acn3.f134819a |= 2;
            acn3.f134820b = obj3;
            ack.copyOnWrite();
            acl acl = (acl) ack.instance;
            acn acn4 = (acn) acm2.build();
            acn4.getClass();
            acl.f134813c = acn4;
            acl.f134811a |= 2;
            if (messageNotification2.mo39558o().isPresent()) {
                String str5 = (String) messageNotification2.mo39558o().get();
                ack.copyOnWrite();
                acl acl2 = (acl) ack.instance;
                str5.getClass();
                acl2.f134811a |= 8;
                acl2.f134815e = str5;
            }
            if (messageNotification2.mo39552i().isPresent()) {
                String uri2 = ((Uri) messageNotification2.mo39552i().get()).toString();
                ack.copyOnWrite();
                acl acl3 = (acl) ack.instance;
                uri2.getClass();
                acl3.f134811a |= 16;
                acl3.f134816f = uri2;
            }
            if (messageNotification2.mo39561r().isPresent()) {
                C63042fg i3 = C62953e.m95484i(((Long) messageNotification2.mo39561r().get()).longValue());
                ack.copyOnWrite();
                acl acl4 = (acl) ack.instance;
                i3.getClass();
                acl4.f134812b = i3;
                acl4.f134811a |= 1;
            }
            if (z && messageNotification2.mo39557n().isPresent()) {
                String obj4 = ((CharSequence) messageNotification2.mo39557n().get()).toString();
                ack.copyOnWrite();
                acl acl5 = (acl) ack.instance;
                obj4.getClass();
                acl5.f134811a |= 4;
                acl5.f134814d = obj4;
            }
            ach.mo53672a(ack);
        }
        String u = messageNotification.mo39565u();
        if (u != null) {
            ach.copyOnWrite();
            aco aco15 = (aco) ach.instance;
            aco15.f134823a |= 2048;
            aco15.f134834l = u;
        }
        if (messageNotification.mo39554k().isPresent()) {
            CharSequence charSequence = (CharSequence) messageNotification.mo39554k().get();
            ach.copyOnWrite();
            aco aco16 = (aco) ach.instance;
            aco16.f134831i = 2;
            aco16.f134823a |= 128;
            if (TextUtils.isEmpty(charSequence)) {
                str = this.f92411b.getString(R.string.tng_default_group_name);
            } else {
                str = charSequence.toString();
            }
            ach.copyOnWrite();
            aco aco17 = (aco) ach.instance;
            str.getClass();
            aco17.f134823a |= 256;
            aco17.f134832j = str;
        }
        return C60856cj.m92900i(Optional.m71637of((aco) ach.build()));
    }

    /* renamed from: b */
    public final C60870cx mo20104b(List list, boolean z) {
        C59104x b = f92410a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MsgNotifConv");
        ((C59052c) ((C59052c) b).mo56372aa(51446)).mo56386p("#convertBundledMessageNotifications");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(mo20103a((BundledMessageNotification) list.get(i), i, z));
        }
        return C47633f.m84733g(C60856cj.m92896e(arrayList)).mo51515h(C34840c.f92409a, this.f92412c);
    }
}
