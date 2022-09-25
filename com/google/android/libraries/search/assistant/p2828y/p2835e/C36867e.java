package com.google.android.libraries.search.assistant.p2828y.p2835e;

import android.database.Cursor;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.libraries.search.assistant.y.e.e */
/* compiled from: PG */
public final /* synthetic */ class C36867e implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C36870h f96013a;

    public /* synthetic */ C36867e(C36870h hVar) {
        this.f96013a = hVar;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        C36870h hVar = this.f96013a;
        Cursor cursor = (Cursor) obj;
        String str = null;
        if (cursor != null) {
            try {
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow(hVar.mo40430b());
                if (columnIndexOrThrow == -1) {
                    ((C59052c) ((C59052c) C36870h.f96017a.mo56226d()).mo56372aa(52376)).mo56386p("Requested APN column not present in the result cursor");
                } else if (cursor.moveToNext()) {
                    str = cursor.getString(columnIndexOrThrow);
                }
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) C36870h.f96017a.mo56226d()).mo56382g(e)).mo56372aa(52375)).mo56386p("[NonFatal]Failed to read APN");
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
            cursor.close();
        }
        return str;
    }
}
