package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b;

import android.icu.text.DisplayContext;
import android.icu.text.NumberFormat;
import android.icu.text.RelativeDateTimeFormatter;
import android.icu.util.ULocale;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64118c;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64128m;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.a.b.j */
/* compiled from: PG */
abstract class C39923j {
    /* renamed from: a */
    public abstract ULocale mo42076a();

    /* renamed from: b */
    public abstract C64118c mo42077b();

    /* renamed from: c */
    public abstract C64128m mo42078c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final RelativeDateTimeFormatter mo42082d() {
        RelativeDateTimeFormatter.Style style;
        DisplayContext displayContext;
        ULocale a = mo42076a();
        NumberFormat numberFormat = C39924k.f104956g;
        int i = C39921h.f104948d[mo42078c().ordinal()];
        if (i == 1) {
            style = RelativeDateTimeFormatter.Style.NARROW;
        } else if (i == 2) {
            style = RelativeDateTimeFormatter.Style.SHORT;
        } else if (i == 3 || i == 4) {
            style = RelativeDateTimeFormatter.Style.LONG;
        } else {
            throw new AssertionError("Exhaustive switch");
        }
        switch (C39921h.f104949e[mo42077b().ordinal()]) {
            case 1:
                displayContext = DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE;
                break;
            case 2:
                displayContext = DisplayContext.CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE;
                break;
            case 3:
                displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
                break;
            case 4:
                displayContext = DisplayContext.CAPITALIZATION_FOR_UI_LIST_OR_MENU;
                break;
            case 5:
            case 6:
                displayContext = DisplayContext.CAPITALIZATION_NONE;
                break;
            default:
                throw new AssertionError("Exhaustive switch");
        }
        return RelativeDateTimeFormatter.getInstance(a, numberFormat, style, displayContext);
    }
}
