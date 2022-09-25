package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.assistant.p3897e.p3921j.C52612ye;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52632yy;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.e */
/* compiled from: PG */
public final /* synthetic */ class C33149e implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C33163s f88690a;

    /* renamed from: b */
    public final /* synthetic */ HashMap f88691b;

    public /* synthetic */ C33149e(C33163s sVar, HashMap hashMap) {
        this.f88690a = sVar;
        this.f88691b = hashMap;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        HashMap hashMap;
        C33163s sVar;
        CharSequence applicationLabel;
        C33163s sVar2 = this.f88690a;
        HashMap hashMap2 = this.f88691b;
        Cursor cursor = (Cursor) obj;
        HashMap hashMap3 = new HashMap();
        while (cursor != null && cursor.moveToNext()) {
            int i = 0;
            long j = cursor.getLong(0);
            String string = cursor.getString(2);
            String string2 = cursor.getString(3);
            String string3 = cursor.getString(4);
            String string4 = cursor.getString(5);
            long j2 = cursor.getLong(6);
            if (string2 != null && !TextUtils.isEmpty(string3)) {
                if (true == TextUtils.isEmpty(string4)) {
                    string4 = string3;
                }
                Map map = (Map) Map.EL.computeIfAbsent(hashMap3, Long.valueOf(j), C33155k.f88698a);
                C33146b bVar = new C33146b();
                bVar.f88686a = string;
                bVar.f88687b = string2;
                C33162r a = bVar.mo38551a();
                if (hashMap2.containsKey(a)) {
                    ArrayList arrayList = (ArrayList) hashMap2.get(a);
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        String str = (String) arrayList.get(i2);
                        try {
                            ApplicationInfo applicationInfo = sVar2.f88717i.getApplicationInfo(str, i);
                            if (!(applicationInfo == null || (applicationLabel = sVar2.f88717i.getApplicationLabel(applicationInfo)) == null || applicationLabel.length() == 0)) {
                                String obj2 = applicationLabel.toString();
                                C52632yy yyVar = (C52632yy) C52633yz.f138192f.createBuilder();
                                yyVar.copyOnWrite();
                                sVar = sVar2;
                                try {
                                    C52633yz yzVar = (C52633yz) yyVar.instance;
                                    str.getClass();
                                    hashMap = hashMap2;
                                    try {
                                        yzVar.f138194a |= 1;
                                        yzVar.f138195b = str;
                                        yyVar.copyOnWrite();
                                        C52633yz yzVar2 = (C52633yz) yyVar.instance;
                                        obj2.getClass();
                                        try {
                                            yzVar2.f138194a |= 2;
                                            yzVar2.f138196c = obj2;
                                            C52612ye yeVar = (C52612ye) C52613yf.f138138f.createBuilder();
                                            yeVar.copyOnWrite();
                                            C52613yf yfVar = (C52613yf) yeVar.instance;
                                            string4.getClass();
                                            yfVar.f138140a |= 8;
                                            yfVar.f138144e = string4;
                                            yeVar.copyOnWrite();
                                            C52613yf yfVar2 = (C52613yf) yeVar.instance;
                                            string3.getClass();
                                            try {
                                                yfVar2.f138140a |= 1;
                                                yfVar2.f138141b = string3;
                                                yeVar.copyOnWrite();
                                                C52613yf yfVar3 = (C52613yf) yeVar.instance;
                                                yfVar3.f138140a |= 4;
                                                yfVar3.f138143d = string2;
                                                C52613yf yfVar4 = (C52613yf) yeVar.build();
                                                yyVar.copyOnWrite();
                                                C52633yz yzVar3 = (C52633yz) yyVar.instance;
                                                yfVar4.getClass();
                                                yzVar3.f138197d = yfVar4;
                                                try {
                                                    yzVar3.f138194a |= 4;
                                                    yyVar.copyOnWrite();
                                                    C52633yz yzVar4 = (C52633yz) yyVar.instance;
                                                    yzVar4.f138194a |= 8;
                                                    yzVar4.f138198e = j2;
                                                    ((List) Map.EL.computeIfAbsent(map, str, C33156l.f88699a)).add((C52633yz) yyVar.build());
                                                } catch (PackageManager.NameNotFoundException unused) {
                                                }
                                            } catch (PackageManager.NameNotFoundException unused2) {
                                            }
                                        } catch (PackageManager.NameNotFoundException unused3) {
                                        }
                                    } catch (PackageManager.NameNotFoundException unused4) {
                                    }
                                } catch (PackageManager.NameNotFoundException unused5) {
                                }
                                i2++;
                                sVar2 = sVar;
                                hashMap2 = hashMap;
                                i = 0;
                            }
                        } catch (PackageManager.NameNotFoundException unused6) {
                        }
                        sVar = sVar2;
                        hashMap = hashMap2;
                        i2++;
                        sVar2 = sVar;
                        hashMap2 = hashMap;
                        i = 0;
                    }
                }
            }
        }
        return hashMap3;
    }
}
