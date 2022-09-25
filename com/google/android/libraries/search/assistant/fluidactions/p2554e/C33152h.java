package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3921j.C52628yu;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.h */
/* compiled from: PG */
public final /* synthetic */ class C33152h implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C33163s f88695a;

    public /* synthetic */ C33152h(C33163s sVar) {
        this.f88695a = sVar;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Optional optional;
        Optional optional2;
        C33163s sVar = this.f88695a;
        Cursor cursor = (Cursor) obj;
        ArrayList<C52629yv> arrayList = new ArrayList<>();
        while (cursor != null && cursor.moveToNext()) {
            String string = cursor.getString(3);
            if (TextUtils.isEmpty(string)) {
                optional = Optional.empty();
            } else {
                int i = !cursor.isNull(4) ? cursor.getInt(4) : -1;
                String str = null;
                if (!(i == 0 || i == -1)) {
                    str = ContactsContract.CommonDataKinds.Phone.getTypeLabel(sVar.f88715g.getResources(), i, (CharSequence) null).toString();
                }
                if (str == null) {
                    str = cursor.getString(5);
                }
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
                C52628yu yuVar = (C52628yu) C52629yv.f138180g.createBuilder();
                yuVar.copyOnWrite();
                C52629yv yvVar = (C52629yv) yuVar.instance;
                string.getClass();
                yvVar.f138182a |= 2;
                yvVar.f138184c = string;
                yuVar.copyOnWrite();
                C52629yv yvVar2 = (C52629yv) yuVar.instance;
                yvVar2.f138182a = 4 | yvVar2.f138182a;
                yvVar2.f138185d = str;
                String stripSeparators = PhoneNumberUtils.stripSeparators(string);
                if (TextUtils.isEmpty(stripSeparators)) {
                    optional2 = Optional.empty();
                } else {
                    String country = Locale.getDefault().getCountry();
                    String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(stripSeparators, TextUtils.isEmpty(country) ? "US" : country.toUpperCase(Locale.US));
                    if (TextUtils.isEmpty(formatNumberToE164)) {
                        optional2 = Optional.empty();
                    } else {
                        optional2 = Optional.m71637of(formatNumberToE164);
                    }
                }
                Objects.requireNonNull(yuVar);
                optional2.ifPresent(new C33153i(yuVar));
                optional = Optional.m71637of((C52629yv) yuVar.build());
            }
            Objects.requireNonNull(arrayList);
            optional.ifPresent(new C33159o(arrayList));
        }
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C52629yv yvVar3 : arrayList) {
            if ((yvVar3.f138182a & 8) == 0) {
                arrayList2.add(yvVar3);
            } else if (linkedHashMap.containsKey(yvVar3.f138186e)) {
                C52628yu yuVar2 = (C52628yu) yvVar3.toBuilder();
                C52629yv yvVar4 = (C52629yv) linkedHashMap.get(yvVar3.f138186e);
                yvVar4.getClass();
                yuVar2.mergeFrom(yvVar4);
                linkedHashMap.put(yvVar3.f138186e, (C52629yv) yuVar2.build());
            } else {
                linkedHashMap.put(yvVar3.f138186e, yvVar3);
            }
        }
        arrayList2.addAll(linkedHashMap.values());
        return arrayList2;
    }
}
