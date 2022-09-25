package com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.C13248a;
import com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47630c;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55082fe;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.f.a.a.f */
/* compiled from: PG */
public final class C13254f implements C13248a {

    /* renamed from: a */
    public static final C59071e f40921a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.common.f.a.a.f");

    /* renamed from: b */
    public static final String[] f40922b = {"type", "number", "name", "date"};

    /* renamed from: c */
    public final C46877q f40923c;

    /* renamed from: d */
    public final C21370a f40924d;

    /* renamed from: e */
    public final Context f40925e;

    /* renamed from: f */
    public final Executor f40926f;

    public C13254f(C21370a aVar, Context context, C46877q qVar, Executor executor) {
        this.f40924d = aVar;
        this.f40925e = context;
        this.f40923c = qVar;
        this.f40926f = executor;
    }

    /* renamed from: c */
    public static String m29511c(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? C58837ba.m90858g(cursor.getString(columnIndex)) : BuildConfig.FLAVOR;
    }

    /* renamed from: d */
    public static Set m29512d(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C55082fe) it.next()).f144920g;
            if (!TextUtils.isEmpty(str)) {
                try {
                    hashSet.add(Long.valueOf(ContentUris.parseId(Uri.parse(str))));
                } catch (NumberFormatException | UnsupportedOperationException e) {
                    C59104x c = f40921a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "RedialRetriever");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(44720)).mo56389s("ContactInformation has invalid ClientEntityId: %s", str);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: e */
    public static int m29513e(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("type");
        if (columnIndex >= 0) {
            return cursor.getInt(columnIndex);
        }
        return -1;
    }

    /* renamed from: f */
    public static boolean m29514f(int i, int i2) {
        if (i2 == 1) {
            return i == 3 || i == 5;
        }
        if (i2 == 2) {
            return i == 2 || i == 3;
        }
        if (i2 == 3 || i2 == 5) {
            return i == 4 || i == 5 || i == 3;
        }
        C59104x d = f40921a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "RedialRetriever");
        ((C59052c) ((C59052c) d).mo56372aa(44721)).mo56386p("Unknown call type");
        return false;
    }

    /* renamed from: a */
    public final C60870cx mo20995a(int i, long j) {
        if (C13315a.m29571a("android.permission.READ_CALL_LOG", this.f40925e)) {
            return new C47630c(this.f40923c.mo50872b(CallLog.Calls.CONTENT_URI, f40922b, (String) null, (String[]) null, "date DESC").f121591a).mo51506d(new C13249a(this, j, i), this.f40926f).mo51507e();
        }
        C59104x d = f40921a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "RedialRetriever");
        ((C59052c) ((C59052c) d).mo56372aa(44717)).mo56386p("READ_CALL_LOG permission is missing");
        return C60856cj.m92900i(C58485gu.m89845m());
    }

    /* renamed from: b */
    public final C60870cx mo20996b(String str) {
        if (!C13315a.m29571a("android.permission.READ_CONTACTS", this.f40925e)) {
            C59104x d = f40921a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RedialRetriever");
            ((C59052c) ((C59052c) d).mo56372aa(44715)).mo56386p("READ_CONTACTS permission is missing.");
            return C60856cj.m92900i(new HashMap());
        }
        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str));
        return new C47630c(this.f40923c.mo50872b(withAppendedPath, new String[]{"display_name", "_id", "photo_thumb_uri"}, (String) null, (String[]) null, (String) null).f121591a).mo51505c(C13250b.f40910a, this.f40926f).mo51507e();
    }
}
