package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public abstract class AutocompletePrediction implements Parcelable {

    /* compiled from: PG */
    public abstract class SubstringMatch implements Parcelable {
        /* renamed from: a */
        public abstract int mo37472a();

        /* renamed from: b */
        public abstract int mo37473b();
    }

    /* renamed from: l */
    public static final SpannableString m59333l(String str, List list, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (!(str.length() == 0 || characterStyle == null || list == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SubstringMatch substringMatch = (SubstringMatch) it.next();
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), substringMatch.mo37473b(), substringMatch.mo37473b() + substringMatch.mo37472a(), 0);
            }
        }
        return spannableString;
    }

    /* renamed from: a */
    public abstract Integer mo37460a();

    /* renamed from: b */
    public abstract String mo37461b();

    /* renamed from: c */
    public abstract String mo37462c();

    /* renamed from: d */
    public abstract String mo37463d();

    /* renamed from: e */
    public abstract String mo37464e();

    /* renamed from: f */
    public abstract List mo37466f();

    /* renamed from: g */
    public abstract List mo37467g();

    /* renamed from: h */
    public abstract List mo37468h();

    /* renamed from: i */
    public abstract List mo37470i();

    /* renamed from: j */
    public final SpannableString mo37573j(CharacterStyle characterStyle) {
        return m59333l(mo37463d(), mo37468h(), characterStyle);
    }

    /* renamed from: k */
    public final SpannableString mo37574k(CharacterStyle characterStyle) {
        return m59333l(mo37464e(), mo37470i(), characterStyle);
    }
}
