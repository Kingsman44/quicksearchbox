package com.google.android.apps.gsa.staticplugins.p7930es;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.telephony.PhoneNumberUtils;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58869cf;
import com.google.common.base.C58911u;
import com.google.common.p4526f.C59052c;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.o */
/* compiled from: PG */
public final /* synthetic */ class C100660o implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C100664s f281473a;

    /* renamed from: b */
    public final /* synthetic */ String f281474b;

    /* renamed from: c */
    public final /* synthetic */ String f281475c;

    public /* synthetic */ C100660o(C100664s sVar, String str, String str2) {
        this.f281473a = sVar;
        this.f281474b = str;
        this.f281475c = str2;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C100664s sVar = this.f281473a;
        String str = this.f281474b;
        String str2 = this.f281475c;
        try {
            Context context = sVar.f281484b;
            ContentResolver contentResolver = context.getContentResolver();
            HashSet hashSet = new HashSet();
            for (String stripSeparators : C58869cf.m90938d(",").mo56151a().mo56152f(C58911u.f156751b).mo56153g(str2)) {
                hashSet.add(PhoneNumberUtils.stripSeparators(stripSeparators));
            }
            long orCreateThreadId = Telephony.Threads.getOrCreateThreadId(context, hashSet);
            if (orCreateThreadId != -1) {
                ContentValues contentValues = new ContentValues(6);
                contentValues.put("thread_id", Long.valueOf(orCreateThreadId));
                contentValues.put("body", str);
                contentValues.put("type", 6);
                contentValues.put("read", 1);
                contentValues.put("seen", 1);
                contentValues.put("address", str2);
                Uri insert = contentResolver.insert(C100666u.f281495b, contentValues);
                if (insert != null) {
                    return Long.valueOf(ContentUris.parseId(insert));
                }
                throw new C100665t("Failed to insert SMS message and recipients: Insert Uri null.");
            }
            ((C59052c) ((C59052c) C100666u.f281494a.mo56225c()).mo56372aa(33964)).mo56386p("not inserting into sms database");
            throw new C100665t("Can't get thread ID");
        } catch (Exception e) {
            throw new C100665t(e);
        } catch (C100665t e2) {
            ((C59052c) ((C59052c) ((C59052c) C100664s.f281482a.mo56225c()).mo56382g(e2)).mo56372aa(33962)).mo56389s("SmsDatabaseException while inserting queued SMS into database: %s", e2.getMessage());
            throw new C100665t("Exception while inserting queued SMS into Database: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
