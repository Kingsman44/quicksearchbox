package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.assistant.p3897e.p3921j.C52618yk;
import com.google.assistant.p3897e.p3921j.C52619yl;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.f */
/* compiled from: PG */
public final /* synthetic */ class C33150f implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C33150f f88692a = new C33150f();

    private /* synthetic */ C33150f() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor != null && cursor.moveToNext()) {
            String string = cursor.getString(3);
            if (!TextUtils.isEmpty(string)) {
                C52618yk ykVar = (C52618yk) C52619yl.f138149d.createBuilder();
                ykVar.copyOnWrite();
                C52619yl ylVar = (C52619yl) ykVar.instance;
                string.getClass();
                ylVar.f138151a |= 2;
                ylVar.f138152b = string;
                arrayList.add((C52619yl) ykVar.build());
            }
        }
        return arrayList;
    }
}
