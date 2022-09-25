package com.google.android.apps.gsa.staticplugins.opa.morris2.p8384e;

import android.content.Context;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.apps.gsa.notificationlistener.C83396l;
import com.google.android.apps.gsa.shared.notificationlistening.collection.C90360a;
import com.google.android.apps.gsa.shared.notificationlistening.collection.C90410q;
import com.google.android.apps.gsa.shared.notificationlistening.collection.NotificationParseConfigs;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2797g.C36526b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.e.a */
/* compiled from: PG */
public final /* synthetic */ class C109509a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C109517g f305012a;

    /* renamed from: b */
    public final /* synthetic */ StatusBarNotification[] f305013b;

    public /* synthetic */ C109509a(C109517g gVar, StatusBarNotification[] statusBarNotificationArr) {
        this.f305012a = gVar;
        this.f305013b = statusBarNotificationArr;
    }

    public final Object call() {
        int i;
        C109517g gVar = this.f305012a;
        StatusBarNotification[] statusBarNotificationArr = this.f305013b;
        C83396l lVar = gVar.f305032h;
        List asList = Arrays.asList(statusBarNotificationArr);
        C90410q m = NotificationParseConfigs.m146935m();
        C90360a aVar = (C90360a) m;
        aVar.f252368a = C58485gu.m89842j(C89988b.m146551d(gVar.f305029e.mo85403h(C90014bt.f247367fn)));
        aVar.f252369b = C58485gu.m89842j(C89988b.m146551d(gVar.f305029e.mo85403h(C90014bt.f247504iR)));
        aVar.f252370c = C58485gu.m89842j(C89988b.m146551d(gVar.f305029e.mo85403h(C90014bt.f247620kb)));
        m.mo84069f(gVar.f305029e.mo85405j(C90014bt.f247502iP));
        m.mo84068e(gVar.f305029e.mo85405j(C90014bt.f247267dt));
        m.mo84067d(gVar.f305029e.mo85405j(C90014bt.f247266ds));
        m.mo84066c(gVar.f305029e.mo85405j(C90025cd.f248157o));
        m.mo84065b(true);
        m.mo84070g(true);
        m.mo84071h(gVar.f305029e.mo85405j(C90014bt.f247528ip));
        m.mo84072i((int) gVar.f305029e.mo85399d(C90014bt.f247508iV));
        ArrayList arrayList = new ArrayList(lVar.mo76695a(asList, m.mo84064a()));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C58485gu d = ((BundledMessageNotification) arrayList.get(i2)).mo84113d();
            int size2 = d.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 >= size2) {
                    break;
                }
                MessageNotification messageNotification = (MessageNotification) d.get(i3);
                if (C58837ba.m90858g(messageNotification.f252545v).startsWith("audio") && messageNotification.f252546w != null && !TextUtils.isEmpty(messageNotification.f252547x)) {
                    try {
                        File cacheDir = gVar.f305030f.getCacheDir();
                        String str = messageNotification.f252547x;
                        str.getClass();
                        File file = new File(cacheDir, str);
                        Context context = gVar.f305030f;
                        Uri uri = messageNotification.f252546w;
                        uri.getClass();
                        C36526b.m65065a(context, uri, file);
                    } catch (IOException e) {
                        C59104x d2 = C109517g.f305025a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "Morris.NotiListener");
                        ((C59052c) ((C59052c) d2).mo56372aa(24992)).mo56389s("Failed to save audio uri to cache. Error: %s", e.getMessage());
                    }
                }
                i3++;
            }
            i2 = i;
        }
        return arrayList;
    }
}
