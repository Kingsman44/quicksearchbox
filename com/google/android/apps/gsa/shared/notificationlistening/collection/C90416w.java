package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.app.Notification;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.core.app.C1832s;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90389w;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90429j;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60242lp;
import com.google.common.p4552o.C60244lr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.w */
/* compiled from: PG */
public final class C90416w extends C90399f {

    /* renamed from: a */
    static final int f252508a = Color.parseColor("#787878");

    /* renamed from: b */
    private static final C59071e f252509b = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.collection.w");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo84104a(Context context, C90396c cVar, C60242lp lpVar, boolean z) {
        CharSequence charSequence = cVar.f252472b;
        if (charSequence != null) {
            return charSequence.toString();
        }
        C90366ae.m146974m(lpVar, 12, Collections.singletonList(C60244lr.NO_EXTRA_TITLE_OR_EXTRA_TEXT));
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo84105b() {
        return 12;
    }

    /* renamed from: d */
    public final List mo84092d(Context context, C89656k kVar, C21370a aVar, C90367af afVar, C90381o oVar, C60242lp lpVar, boolean z) {
        SpannableString spannableString;
        ForegroundColorSpan foregroundColorSpan;
        ForegroundColorSpan foregroundColorSpan2;
        C90367af afVar2 = afVar;
        Notification notification = afVar2.f252393a.getNotification();
        C90396c cVar = new C90396c(notification);
        if (!"msg".equals(notification.category)) {
            return Collections.emptyList();
        }
        CharSequence charSequence = cVar.f252471a;
        if (charSequence == null || !charSequence.toString().contains("InboxStyle")) {
            Context context2 = context;
            C89656k kVar2 = kVar;
            C21370a aVar2 = aVar;
            C90381o oVar2 = oVar;
            CharSequence charSequence2 = cVar.f252471a;
            if (charSequence2 != null && charSequence2.toString().contains("BigTextStyle")) {
                return super.mo84092d(context, kVar, aVar, afVar, oVar, lpVar, z);
            }
            ((C59052c) ((C59052c) f252509b.mo56225c()).mo56372aa(10842)).mo56354G("Unsupported Verizon message+ template with message category. template[%s], notification[%s]", cVar.f252471a, afVar2.f252393a);
            return Collections.emptyList();
        }
        Notification notification2 = afVar2.f252393a.getNotification();
        ArrayList arrayList = new ArrayList();
        CharSequence[] charSequenceArr = cVar.f252474d;
        int length = charSequenceArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            CharSequence charSequence3 = charSequenceArr[i2];
            if (charSequence3 instanceof SpannableStringBuilder) {
                spannableString = SpannableString.valueOf(charSequence3);
            } else {
                spannableString = charSequence3 instanceof SpannableString ? (SpannableString) charSequence3 : null;
            }
            if (spannableString == null) {
                ((C59052c) ((C59052c) f252509b.mo56226d()).mo56372aa(10841)).mo56386p("Line is not SpannableString or SpannableStringBuilder");
            } else {
                ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableString.getSpans(i, spannableString.length(), ForegroundColorSpan.class);
                if (foregroundColorSpanArr.length != 2) {
                    ((C59052c) ((C59052c) f252509b.mo56226d()).mo56372aa(10840)).mo56386p("Only 2 spans are supported for InboxStyle notification parsing.");
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 2) {
                            foregroundColorSpan = null;
                            break;
                        }
                        foregroundColorSpan = foregroundColorSpanArr[i3];
                        if (foregroundColorSpan.getForegroundColor() == f252508a) {
                            break;
                        }
                        i3++;
                    }
                    int length2 = foregroundColorSpanArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            foregroundColorSpan2 = null;
                            break;
                        }
                        foregroundColorSpan2 = foregroundColorSpanArr[i4];
                        if (foregroundColorSpan2.getForegroundColor() != f252508a) {
                            break;
                        }
                        i4++;
                    }
                    if (foregroundColorSpan == null || foregroundColorSpan2 == null) {
                        Context context3 = context;
                        C89656k kVar3 = kVar;
                        C21370a aVar3 = aVar;
                        C90381o oVar3 = oVar;
                        ((C59052c) ((C59052c) f252509b.mo56226d()).mo56372aa(10839)).mo56386p("Failed to find span for sender name or message text.");
                        i2++;
                        i = 0;
                    } else {
                        CharSequence subSequence = spannableString.subSequence(spannableString.getSpanStart(foregroundColorSpan), spannableString.getSpanEnd(foregroundColorSpan));
                        CharSequence subSequence2 = spannableString.subSequence(spannableString.getSpanStart(foregroundColorSpan2), spannableString.getSpanEnd(foregroundColorSpan2));
                        C90429j jVar = new C90429j(aVar);
                        jVar.f252622s = subSequence2;
                        jVar.f252623t = "text/plain";
                        jVar.f252615D = subSequence.toString();
                        jVar.mo84160c((C1832s) null);
                        jVar.f252614C = notification2;
                        C90366ae.m146971j(context, kVar, afVar2, oVar, jVar);
                        jVar.mo84143a(afVar2.f252393a.getKey(), subSequence.toString());
                        jVar.f252568e = "msg";
                        arrayList.add(new MessageNotification(jVar));
                        i2++;
                        i = 0;
                    }
                }
            }
            Context context4 = context;
            C89656k kVar4 = kVar;
            C21370a aVar4 = aVar;
            C90381o oVar4 = oVar;
            i2++;
            i = 0;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C90389w mo84101i(Context context, Notification notification, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return new C90389w(charSequence, "text/plain");
    }
}
