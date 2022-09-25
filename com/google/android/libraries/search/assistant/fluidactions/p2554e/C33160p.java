package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.ArrayList;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.p */
/* compiled from: PG */
public final /* synthetic */ class C33160p implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ String f88708a;

    public /* synthetic */ C33160p(String str) {
        this.f88708a = str;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Optional optional;
        String str = this.f88708a;
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor != null && cursor.moveToNext()) {
            String string = cursor.getString(2);
            String string2 = cursor.getString(4);
            if (TextUtils.isEmpty(string)) {
                optional = Optional.empty();
            } else {
                if (!TextUtils.isEmpty(string2) && string.equals(str)) {
                    try {
                        optional = Optional.m71637of(Long.valueOf(Long.parseLong(string2, 16)));
                    } catch (NumberFormatException e) {
                        ((C59052c) ((C59052c) ((C59052c) C33163s.f88709a.mo56226d()).mo56382g(e)).mo56372aa(51196)).mo56389s("Could not parse Focus ID: %s", string2);
                    }
                }
                optional = Optional.empty();
            }
            Objects.requireNonNull(arrayList);
            optional.ifPresent(new C33157m(arrayList));
        }
        return arrayList;
    }
}
