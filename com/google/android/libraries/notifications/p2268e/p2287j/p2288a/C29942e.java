package com.google.android.libraries.notifications.p2268e.p2287j.p2288a;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.C1839z;
import androidx.p060c.C0979i;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2268e.p2287j.C29937a;
import com.google.android.libraries.notifications.p2268e.p2287j.C29951b;
import com.google.android.libraries.notifications.p2268e.p2287j.C29952c;
import com.google.android.libraries.notifications.p2268e.p2287j.C29956g;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2309c.C30071a;
import com.google.android.libraries.notifications.platform.p2309c.C30073c;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.libraries.notifications.platform.p2318f.p2331f.p2334b.C30140a;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55575k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.e.j.a.e */
/* compiled from: PG */
public final class C29942e implements C29956g {

    /* renamed from: a */
    private final Context f81083a;

    /* renamed from: b */
    private final C30075e f81084b;

    public C29942e(Context context, C30075e eVar) {
        this.f81083a = context;
        this.f81084b = eVar;
    }

    /* renamed from: a */
    public final String mo35234a(C29827r rVar) {
        C0979i iVar = new C0979i(0);
        for (NotificationChannel id : ((NotificationManager) this.f81083a.getSystemService("notification")).getNotificationChannels()) {
            iVar.add(id.getId());
        }
        C55575k kVar = rVar.mo35052a().f146673n;
        if (kVar == null) {
            kVar = C55575k.f146629b;
        }
        String str = kVar.f146631a;
        if (!TextUtils.isEmpty(str) && iVar.contains(str)) {
            return str;
        }
        String str2 = ((C30073c) ((C30071a) this.f81084b).f81358d).f81378c;
        if (!TextUtils.isEmpty(str2) && iVar.contains(str2)) {
            return str2;
        }
        C30058b.m55791c("NotificationChannelHelperImpl", "Did not find the intended channel '%s' or the default channel '%s' in '%s'", str, str2, iVar);
        return null;
    }

    /* renamed from: b */
    public final List mo35235b() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (NotificationChannelGroup next : ((NotificationManager) this.f81083a.getSystemService("notification")).getNotificationChannelGroups()) {
            C29951b bVar = new C29951b();
            bVar.mo35250a(false);
            String id = next.getId();
            if (id != null) {
                bVar.f81106a = id;
                bVar.mo35250a(next.isBlocked());
                if (bVar.f81108c != 1 || (str = bVar.f81106a) == null) {
                    StringBuilder sb = new StringBuilder();
                    if (bVar.f81106a == null) {
                        sb.append(" id");
                    }
                    if (bVar.f81108c == 0) {
                        sb.append(" blocked");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                arrayList.add(new C29952c(str, bVar.f81107b));
            } else {
                throw new NullPointerException("Null id");
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List mo35236c() {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel next : ((NotificationManager) this.f81083a.getSystemService("notification")).getNotificationChannels()) {
            String id = next.getId();
            if (id != null) {
                int importance = next.getImportance();
                if (importance != 0) {
                    i = 4;
                    if (importance != 2) {
                        i = importance != 3 ? importance != 4 ? 1 : 3 : 2;
                    }
                } else {
                    i = 5;
                }
                if (!TextUtils.isEmpty(next.getGroup())) {
                    str = next.getGroup();
                    if (str == null) {
                        throw new NullPointerException("Null group");
                    }
                } else {
                    str = BuildConfig.FLAVOR;
                }
                arrayList.add(new C29937a(id, str, i));
            } else {
                throw new NullPointerException("Null id");
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void mo35237d(C1839z zVar, C29827r rVar) {
        String a = mo35234a(rVar);
        if (!TextUtils.isEmpty(a)) {
            C30058b.m55793e("NotificationChannelHelperImpl", "Setting channel Id: '%s'", a);
            zVar.f5675F = a;
        }
    }

    /* renamed from: e */
    public final boolean mo35238e(String str) {
        NotificationChannel notificationChannel;
        if (!C30140a.m55989b(this.f81083a)) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && (notificationChannel = ((NotificationManager) this.f81083a.getSystemService("notification")).getNotificationChannel(str)) != null && notificationChannel.getImportance() > 0) {
            return true;
        }
        return false;
    }
}
