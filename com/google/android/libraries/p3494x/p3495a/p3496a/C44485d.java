package com.google.android.libraries.p3494x.p3495a.p3496a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.gms.common.C143701ac;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.api.C144354b;
import com.google.android.libraries.p3494x.p3497b.p3498a.C44490a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.x.a.a.d */
/* compiled from: PG */
public final class C44485d implements C44483b {

    /* renamed from: a */
    private final Context f115637a;

    /* renamed from: b */
    private final C44487f f115638b;

    /* renamed from: c */
    private final C44488g f115639c;

    /* renamed from: d */
    private final C44490a f115640d;

    public C44485d(Context context, C44487f fVar, C44488g gVar, C44490a aVar) {
        this.f115638b = fVar;
        this.f115637a = context;
        this.f115639c = gVar;
        this.f115640d = aVar;
    }

    /* renamed from: c */
    private final Intent m78587c(String str, List list, List list2, Optional optional) {
        Optional empty;
        C58833ax axVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C44484c.CHAT_STANDALONE);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                empty = Optional.empty();
                break;
            }
            C44484c cVar = (C44484c) it.next();
            String str2 = ((C44482a) cVar.f115636c).f115632a;
            if (C143701ac.m233450a(this.f115638b.f115641a).mo119084c(str2)) {
                Intent intent = new Intent("com.google.android.apps.dynamite.startdm");
                intent.setPackage(str2);
                empty = Optional.ofNullable(C58833ax.m90833j(intent.resolveActivityInfo(this.f115640d.f115643a, 0)).mo56111f());
                if (empty.isPresent()) {
                    C44490a aVar = this.f115640d;
                    C44489h hVar = cVar.f115636c;
                    try {
                        axVar = C58833ax.m90834k(aVar.f115643a.getPackageInfo(str2, 0));
                    } catch (PackageManager.NameNotFoundException unused) {
                        axVar = C58836b.f156633a;
                    }
                    C58833ax k = axVar.mo56113h() ? C58833ax.m90834k(Integer.valueOf(((PackageInfo) axVar.mo56107c()).versionCode)) : C58836b.f156633a;
                    if (k.mo56113h() && ((Integer) k.mo56107c()).intValue() >= 0) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (!empty.isPresent()) {
            C44488g gVar = this.f115639c;
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.dynamite"));
            C44490a aVar2 = gVar.f115642a;
            if (intent2.resolveActivityInfo(aVar2.f115643a, intent2.getFlags()) == null || !intent2.resolveActivityInfo(aVar2.f115643a, intent2.getFlags()).exported) {
                return new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.dynamite"));
            }
            return intent2;
        }
        Intent data = new Intent().setAction("android.intent.action.VIEW").setData(Uri.parse("https://chat.google.com/startdm"));
        data.putExtra("account_name", str).putStringArrayListExtra("participant_emails", new ArrayList(list)).putStringArrayListExtra("participant_names", new ArrayList(list2));
        C144354b.m234631a(this.f115637a, data, AccountData.m234630a(str));
        data.putExtra("open_keyboard", true);
        if (optional.isPresent()) {
            data.putExtra("initial_message_content", (String) optional.get());
        }
        ActivityInfo activityInfo = (ActivityInfo) empty.get();
        data.setPackage(activityInfo.packageName);
        data.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        return data;
    }

    /* renamed from: a */
    public final Intent mo47369a(String str, List list) {
        return m78587c(str, list, C58485gu.m89845m(), Optional.empty());
    }

    /* renamed from: b */
    public final Intent mo47370b(String str, List list, String str2) {
        return m78587c(str, list, C58485gu.m89845m(), Optional.m71637of(str2));
    }
}
