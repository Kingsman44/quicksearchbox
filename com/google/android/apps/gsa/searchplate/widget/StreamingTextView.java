package com.google.android.apps.gsa.searchplate.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class StreamingTextView extends TextView {

    /* renamed from: a */
    public int f241131a = -7829368;

    /* renamed from: b */
    public boolean f241132b;

    /* renamed from: c */
    public boolean f241133c = true;

    /* renamed from: d */
    private long f241134d;

    /* renamed from: e */
    private final Property f241135e;

    /* renamed from: f */
    private String f241136f;

    /* renamed from: g */
    private final C88982c f241137g;

    /* renamed from: h */
    private final ObjectAnimator f241138h;

    public StreamingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C88981b bVar = new C88981b(this, Integer.class);
        this.f241135e = bVar;
        this.f241136f = BuildConfig.FLAVOR;
        C88982c cVar = new C88982c();
        this.f241137g = cVar;
        this.f241138h = ObjectAnimator.ofInt(cVar, bVar, new int[]{0, PrivateKeyType.INVALID}).setDuration(150);
    }

    /* renamed from: a */
    public final void mo82922a() {
        this.f241136f = BuildConfig.FLAVOR;
        this.f241138h.cancel();
        setText(BuildConfig.FLAVOR);
    }

    /* renamed from: b */
    public final void mo82923b(String str, String str2) {
        if (!this.f241133c || System.currentTimeMillis() - this.f241134d >= 80) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.append(str);
            }
            if (!str2.isEmpty()) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(str2);
                if (this.f241132b) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f241131a), length, str2.length() + length, 33);
                }
                String str3 = this.f241136f;
                int i = 0;
                if (!str2.isEmpty() && !str3.isEmpty()) {
                    if (str2.startsWith(str3)) {
                        i = str3.length();
                    } else if (str3.startsWith(str2) || str3.endsWith(str2)) {
                        i = str2.length();
                    } else {
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < str3.length()) {
                            int i4 = 0;
                            int i5 = 0;
                            while (i4 < str2.length() && (r8 = i2 + i4) != str3.length() && str3.charAt(r8) == str2.charAt(i4)) {
                                i5++;
                                i4++;
                            }
                            i3 = Math.max(i3, i5);
                            i2++;
                        }
                        i = i3;
                    }
                }
                if (i < str2.length()) {
                    spannableStringBuilder.setSpan(this.f241137g, i + length, length + str2.length(), 33);
                    if (this.f241138h.isStarted()) {
                        this.f241138h.cancel();
                    }
                    this.f241138h.start();
                }
                this.f241136f = str2;
            }
            mo82924c(spannableStringBuilder);
            this.f241134d = System.currentTimeMillis();
        }
    }

    /* renamed from: c */
    public final void mo82924c(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(StreamingTextView.class.getCanonicalName());
    }
}
