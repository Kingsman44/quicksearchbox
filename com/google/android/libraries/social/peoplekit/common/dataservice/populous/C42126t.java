package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.content.Context;
import android.database.Cursor;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42098h;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.populous.C42598s;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.populous.t */
/* compiled from: PG */
final class C42126t implements C42098h {

    /* renamed from: a */
    public static final String[] f110189a;

    /* renamed from: b */
    public static final String f110190b = String.format("(mimetype='%s' OR mimetype='%s')", new Object[]{"vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/phone_v2"});

    /* renamed from: c */
    public static final String f110191c = String.format("(mimetype='%s')", new Object[]{"vnd.android.cursor.item/email_v2"});

    /* renamed from: d */
    public static final Map f110192d;

    /* renamed from: e */
    public final Context f110193e;

    /* renamed from: f */
    public final C60887da f110194f;

    /* renamed from: g */
    public final C42598s f110195g;

    /* renamed from: h */
    public final List f110196h = new ArrayList();

    /* renamed from: i */
    public final PeopleKitConfig f110197i;

    /* renamed from: j */
    public int f110198j;

    static {
        String[] strArr = {"_id", "data1", "mimetype", "display_name", "sort_key", "photo_thumb_uri", "contact_id", "starred", "data4", "display_name_source", "lookup"};
        f110189a = strArr;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 11; i++) {
            hashMap.put(strArr[i], Integer.valueOf(i));
        }
        f110192d = hashMap;
    }

    public C42126t(Context context, ExecutorService executorService, C42598s sVar, PeopleKitConfig peopleKitConfig) {
        this.f110193e = context;
        this.f110194f = C60895di.m92995a(executorService);
        this.f110195g = sVar;
        this.f110197i = peopleKitConfig;
    }

    /* renamed from: a */
    public static String m73917a(Cursor cursor, String str) {
        return cursor.getString(((Integer) f110192d.get(str)).intValue());
    }
}
