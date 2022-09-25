package com.google.android.apps.gsa.shared.util.debug;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59796fx;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.k */
/* compiled from: PG */
public final class C91027k {

    /* renamed from: a */
    private static final C59071e f254264a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.debug.k");

    /* renamed from: b */
    private final ContentResolver f254265b;

    public C91027k(ContentResolver contentResolver) {
        this.f254265b = contentResolver;
    }

    /* renamed from: a */
    public final FeedbackData mo85306a(Map map, Map map2, boolean z, boolean z2) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        try {
            Cursor query = this.f254265b.query(Uri.parse("content://com.google.android.velvet.util.statedumpprovider").buildUpon().appendQueryParameter("sensitive", Boolean.toString(z2)).appendQueryParameter("reduced", Boolean.toString(z)).build(), (String[]) null, (String) null, (String[]) null, (String) null);
            query.getClass();
            FeedbackData b = FeedbackData.m148578b(query, map, map2, (String) null);
            Cursor query2 = this.f254265b.query(Uri.parse("content://com.google.android.apps.gsa.voiceinteraction.dump.StateDumpProvider").buildUpon().appendQueryParameter("sensitive", Boolean.toString(z2)).appendQueryParameter("reduced", Boolean.toString(z)).build(), (String[]) null, (String) null, (String[]) null, (String) null);
            query2.getClass();
            return FeedbackData.m148578b(query2, b.f254179e, b.f254181g, b.f254175a);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f254264a.mo56226d()).mo56382g(e)).mo56372aa(11398)).mo56386p("Can't get state dump.");
            if (map == null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = new LinkedHashMap(map);
            }
            linkedHashMap.put("state_dump_exception", "true");
            if (map2 == null) {
                linkedHashMap2 = new LinkedHashMap();
            } else {
                linkedHashMap2 = new LinkedHashMap(map2);
            }
            return new FeedbackData((String) null, (C59796fx) null, linkedHashMap, linkedHashMap2);
        }
    }
}
