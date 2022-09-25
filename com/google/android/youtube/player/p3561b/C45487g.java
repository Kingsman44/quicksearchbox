package com.google.android.youtube.player.p3561b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.google.android.youtube.player.b.g */
public final class C45487g extends FrameLayout {

    /* renamed from: a */
    private final ProgressBar f118907a;

    /* renamed from: b */
    private final TextView f118908b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45487g(Context context) {
        super(context);
        Context context2 = context;
        Resources resources = context.getResources();
        Locale locale = (resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale;
        HashMap hashMap = new HashMap();
        hashMap.put("error_initializing_player", "An error occurred while initializing the YouTube player.");
        hashMap.put("get_youtube_app_title", "Get YouTube App");
        hashMap.put("get_youtube_app_text", "This app won't run without the YouTube App, which is missing from your device");
        hashMap.put("get_youtube_app_action", "Get YouTube App");
        hashMap.put("enable_youtube_app_title", "Enable YouTube App");
        hashMap.put("enable_youtube_app_text", "This app won't work unless you enable the YouTube App.");
        hashMap.put("enable_youtube_app_action", "Enable YouTube App");
        hashMap.put("update_youtube_app_title", "Update YouTube App");
        hashMap.put("update_youtube_app_text", "This app won't work unless you update the YouTube App.");
        hashMap.put("update_youtube_app_action", "Update YouTube App");
        C45456ao.m81110a(hashMap, locale.getLanguage());
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(country).length());
        sb.append(language);
        sb.append("_");
        sb.append(country);
        C45456ao.m81110a(hashMap, sb.toString());
        String str = (String) hashMap.get("get_youtube_app_title");
        String str2 = (String) hashMap.get("get_youtube_app_text");
        String str3 = (String) hashMap.get("get_youtube_app_action");
        String str4 = (String) hashMap.get("enable_youtube_app_title");
        String str5 = (String) hashMap.get("enable_youtube_app_text");
        String str6 = (String) hashMap.get("enable_youtube_app_action");
        String str7 = (String) hashMap.get("update_youtube_app_title");
        String str8 = (String) hashMap.get("update_youtube_app_text");
        String str9 = (String) hashMap.get("update_youtube_app_action");
        setBackgroundColor(-16777216);
        Context context3 = context;
        ProgressBar progressBar = new ProgressBar(context3);
        this.f118907a = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        progressBar.setVisibility(8);
        addView(progressBar, new FrameLayout.LayoutParams(-2, -2, 17));
        int i = (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        TextView textView = new TextView(context3);
        this.f118908b = textView;
        textView.setTextAppearance(context3, 16973894);
        textView.setTextColor(-1);
        textView.setVisibility(8);
        textView.setPadding(i, i, i, i);
        textView.setGravity(17);
        textView.setText((String) hashMap.get("error_initializing_player"));
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    /* renamed from: a */
    public final void mo49658a() {
        this.f118907a.setVisibility(8);
        this.f118908b.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo49659b() {
        this.f118907a.setVisibility(0);
        this.f118908b.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            if (mode2 != 1073741824) {
                mode = 1073741824;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(resolveSize(size, i), 1073741824), View.MeasureSpec.makeMeasureSpec(resolveSize(size2, i2), 1073741824));
        }
        if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
            size2 = (int) (((float) size) / 1.777f);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(resolveSize(size, i), 1073741824), View.MeasureSpec.makeMeasureSpec(resolveSize(size2, i2), 1073741824));
        }
        if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && mode == 0)) {
            f = (float) size2;
        } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            f = (float) size2;
            float f2 = ((float) size) / 1.777f;
            if (f >= f2) {
                size2 = (int) f2;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(resolveSize(size, i), 1073741824), View.MeasureSpec.makeMeasureSpec(resolveSize(size2, i2), 1073741824));
            }
        } else {
            size = 0;
            size2 = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(resolveSize(size, i), 1073741824), View.MeasureSpec.makeMeasureSpec(resolveSize(size2, i2), 1073741824));
        }
        size = (int) (f * 1.777f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(resolveSize(size, i), 1073741824), View.MeasureSpec.makeMeasureSpec(resolveSize(size2, i2), 1073741824));
    }
}
