package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.TtsSpan;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UnknownFormatConversionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.l */
/* compiled from: PG */
public final class C95197l {

    /* renamed from: a */
    public static final C59071e f266337a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.b.b.l");

    /* renamed from: b */
    private static final Pattern f266338b = Pattern.compile("%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])");

    /* renamed from: a */
    public static Spanned m157356a(CharSequence charSequence, String str) {
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new Annotation("BISTO_UGC", str), 0, charSequence.length(), 17);
        return spannableString;
    }

    /* renamed from: b */
    public static C95209x m157357b(Context context, int i, Object... objArr) {
        CharSequence charSequence;
        Object obj;
        Object[] objArr2 = objArr;
        Optional n = C95210y.m157366n();
        String string = context.getString(i);
        Locale locale = (!n.isPresent() || C58837ba.m90859h(((Locale) n.get()).toLanguageTag())) ? null : (Locale) n.get();
        ArrayList<C95196k> arrayList = new ArrayList<>();
        Matcher matcher = f266338b.matcher(string);
        int i2 = 0;
        while (true) {
            if (matcher.find(i2)) {
                if (matcher.start() != i2) {
                    m157358c(string, i2, matcher.start());
                    arrayList.add(new C95194i(string.substring(i2, matcher.start())));
                }
                C95195j jVar = new C95195j(string.substring(matcher.start(), matcher.end()), matcher);
                if (!jVar.mo89101b()) {
                    C59104x d = f266337a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "TtsAnnotationUtil");
                    ((C59052c) ((C59052c) d).mo56372aa(14588)).mo56389s("Missing argument index %s", jVar);
                    arrayList = new ArrayList<>();
                    break;
                }
                arrayList.add(jVar);
                i2 = matcher.end();
            } else if (i2 < string.length()) {
                m157358c(string, i2, string.length());
                arrayList.add(new C95194i(string.substring(i2)));
            }
        }
        if (arrayList.isEmpty()) {
            charSequence = String.format(locale, string, objArr2);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (C95196k kVar : arrayList) {
                if (!kVar.mo89101b()) {
                    spannableStringBuilder.append(kVar.toString());
                } else {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(String.format(locale, kVar.toString(), objArr2));
                    if (kVar.mo89100a() > objArr2.length) {
                        C59104x d2 = f266337a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "TtsAnnotationUtil");
                        ((C59052c) ((C59052c) d2).mo56372aa(14587)).mo56389s("Missing argument: %s", kVar);
                    } else {
                        Object obj2 = objArr2[kVar.mo89100a() - 1];
                        if (!(obj2 instanceof Spanned)) {
                            C59104x b = f266337a.mo56224b();
                            b.mo56378ag(C58975e.f156826a, "TtsAnnotationUtil");
                            ((C59052c) ((C59052c) b).mo56372aa(14586)).mo56386p("Argument is not Spanned.");
                        } else {
                            Spanned spanned = (Spanned) obj2;
                            int length2 = spannableStringBuilder.length() - length;
                            if (spanned.length() != length2) {
                                C59104x d3 = f266337a.mo56226d();
                                d3.mo56378ag(C58975e.f156826a, "TtsAnnotationUtil");
                                ((C59052c) ((C59052c) d3).mo56372aa(14585)).mo56386p("Skipping span copying because formatted length doesn't match argument length.");
                            } else {
                                for (ParcelableSpan parcelableSpan : (ParcelableSpan[]) spanned.getSpans(0, length2, ParcelableSpan.class)) {
                                    if (parcelableSpan instanceof Annotation) {
                                        Annotation annotation = (Annotation) parcelableSpan;
                                        obj = new Annotation(annotation.getKey(), annotation.getValue());
                                    } else if (parcelableSpan instanceof TtsSpan) {
                                        Parcel obtain = Parcel.obtain();
                                        parcelableSpan.writeToParcel(obtain, 0);
                                        obj = new TtsSpan(obtain);
                                    } else {
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        spannableStringBuilder.setSpan(obj, spanned.getSpanStart(parcelableSpan) + length, spanned.getSpanEnd(parcelableSpan) + length, spanned.getSpanFlags(parcelableSpan));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            charSequence = spannableStringBuilder;
        }
        return new C95209x(charSequence);
    }

    /* renamed from: c */
    private static void m157358c(String str, int i, int i2) {
        if (str.substring(i, i2).contains("%")) {
            throw new UnknownFormatConversionException(String.format("Bad format in '%s' at (%d, %d)", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}));
        }
    }
}
