package com.google.android.libraries.search.assistant.performer.communication;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.assistant.p3897e.p3921j.C52612ye;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52616yi;
import com.google.assistant.p3897e.p3921j.C52632yy;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58532in;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4543n.p4545b.C59364ae;
import com.google.common.p4543n.p4545b.C59368b;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.HashMap;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.eb */
/* compiled from: PG */
public final /* synthetic */ class C35706eb implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C58532in f93608a;

    /* renamed from: b */
    public final /* synthetic */ PackageManager f93609b;

    public /* synthetic */ C35706eb(C58532in inVar, PackageManager packageManager) {
        this.f93608a = inVar;
        this.f93609b = packageManager;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        PackageManager packageManager;
        C58532in inVar;
        Optional optional;
        C58532in inVar2 = this.f93608a;
        PackageManager packageManager2 = this.f93609b;
        Cursor cursor = (Cursor) obj;
        HashMap hashMap = new HashMap();
        while (cursor != null && cursor.moveToNext()) {
            try {
                long j = cursor.getLong(cursor.getColumnIndexOrThrow("contact_id"));
                String string = cursor.getString(cursor.getColumnIndexOrThrow("account_type"));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow("mimetype"));
                String string3 = cursor.getString(cursor.getColumnIndexOrThrow("data1"));
                String string4 = cursor.getString(cursor.getColumnIndexOrThrow("data3"));
                long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                if (!(string == null || string2 == null || TextUtils.isEmpty(string3))) {
                    if (true == TextUtils.isEmpty(string4)) {
                        string4 = string3;
                    }
                    C35534b bVar = new C35534b(string, string2);
                    if (inVar2.map.containsKey(bVar)) {
                        C58800sl lA = inVar2.mo54902c(bVar).iterator();
                        while (lA.hasNext()) {
                            String str = (String) lA.next();
                            C52632yy yyVar = (C52632yy) C52633yz.f138192f.createBuilder();
                            yyVar.copyOnWrite();
                            C52633yz yzVar = (C52633yz) yyVar.instance;
                            str.getClass();
                            yzVar.f138194a |= 1;
                            yzVar.f138195b = str;
                            yyVar.copyOnWrite();
                            C52633yz yzVar2 = (C52633yz) yyVar.instance;
                            yzVar2.f138194a |= 8;
                            yzVar2.f138198e = j2;
                            C52612ye yeVar = (C52612ye) C52613yf.f138138f.createBuilder();
                            yeVar.copyOnWrite();
                            C52613yf yfVar = (C52613yf) yeVar.instance;
                            string4.getClass();
                            inVar = inVar2;
                            try {
                                yfVar.f138140a |= 8;
                                yfVar.f138144e = string4;
                                yeVar.copyOnWrite();
                                C52613yf yfVar2 = (C52613yf) yeVar.instance;
                                string3.getClass();
                                yfVar2.f138140a |= 1;
                                yfVar2.f138141b = string3;
                                yeVar.copyOnWrite();
                                C52613yf yfVar3 = (C52613yf) yeVar.instance;
                                yfVar3.f138140a |= 4;
                                yfVar3.f138143d = string2;
                                yyVar.copyOnWrite();
                                C52633yz yzVar3 = (C52633yz) yyVar.instance;
                                C52613yf yfVar4 = (C52613yf) yeVar.build();
                                yfVar4.getClass();
                                yzVar3.f138197d = yfVar4;
                                yzVar3.f138194a |= 4;
                                try {
                                    ApplicationInfo applicationInfo = packageManager2.getApplicationInfo(str, 0);
                                    if (applicationInfo != null) {
                                        optional = Optional.m71637of(packageManager2.getApplicationLabel(applicationInfo).toString());
                                        packageManager = packageManager2;
                                        Objects.requireNonNull(yyVar);
                                        optional.ifPresent(new C35707ec(yyVar));
                                        ((C52616yi) Map.EL.computeIfAbsent(hashMap, Long.valueOf(j), C35708ed.f93611a)).mo53886a(yyVar);
                                        packageManager2 = packageManager;
                                        inVar2 = inVar;
                                    } else {
                                        packageManager = packageManager2;
                                        optional = Optional.empty();
                                        Objects.requireNonNull(yyVar);
                                        optional.ifPresent(new C35707ec(yyVar));
                                        ((C52616yi) Map.EL.computeIfAbsent(hashMap, Long.valueOf(j), C35708ed.f93611a)).mo53886a(yyVar);
                                        packageManager2 = packageManager;
                                        inVar2 = inVar;
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    packageManager = packageManager2;
                                    try {
                                        ((C59052c) ((C59052c) ((C59052c) C35710ef.f93613a.mo56226d()).mo56382g(e)).mo56372aa(51702)).mo56389s("Package %s not found.", str);
                                    } catch (IllegalArgumentException e2) {
                                        e = e2;
                                        ((C59052c) ((C59052c) ((C59052c) C35710ef.f93613a.mo56225c()).mo56382g(e)).mo56372aa(51704)).mo56386p("Column not found.");
                                        packageManager2 = packageManager;
                                        inVar2 = inVar;
                                    }
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                                packageManager = packageManager2;
                                ((C59052c) ((C59052c) ((C59052c) C35710ef.f93613a.mo56225c()).mo56382g(e)).mo56372aa(51704)).mo56386p("Column not found.");
                                packageManager2 = packageManager;
                                inVar2 = inVar;
                            }
                        }
                    }
                }
            } catch (IllegalArgumentException e4) {
                e = e4;
                inVar = inVar2;
                packageManager = packageManager2;
                ((C59052c) ((C59052c) ((C59052c) C35710ef.f93613a.mo56225c()).mo56382g(e)).mo56372aa(51704)).mo56386p("Column not found.");
                packageManager2 = packageManager;
                inVar2 = inVar;
            }
        }
        return (C58495hd) C59364ae.m92266l(hashMap).mo56892c(C35689dx.f93579a).mo56896f(C59368b.f157569a);
    }
}
