package com.google.android.libraries.search.assistant.performer.deviceactions.screenshot;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.google.apps.tiktok.dataservice.C46818g;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p3186j$.util.DesugarDate;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.f */
/* compiled from: PG */
public final class C35971f implements C35966a {

    /* renamed from: a */
    public final C46877q f94149a;

    /* renamed from: b */
    public final Context f94150b;

    /* renamed from: c */
    public final C60887da f94151c;

    /* renamed from: d */
    private final C60950i f94152d;

    /* renamed from: e */
    private final Executor f94153e;

    public C35971f(Executor executor, C60887da daVar, C46877q qVar, Context context, C60950i iVar) {
        this.f94149a = qVar;
        this.f94152d = iVar;
        this.f94150b = context;
        this.f94151c = daVar;
        this.f94153e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo39909a(Uri uri) {
        C60870cx g = this.f94149a.mo50877g(uri);
        C35970e eVar = C35970e.f94148a;
        return C60922j.m93044g(g, C47810es.m84963c(eVar), this.f94151c);
    }

    /* renamed from: b */
    public final C60870cx mo39910b(Bitmap bitmap) {
        Instant a = this.f94152d.mo57444a();
        String format = String.format("Screenshot_%s.png", new Object[]{new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.getDefault(Locale.Category.FORMAT)).format(DesugarDate.from(a))});
        long epochMilli = a.toEpochMilli();
        long epochSecond = a.getEpochSecond();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", format);
        contentValues.put("_display_name", format);
        contentValues.put("datetaken", Long.valueOf(epochMilli));
        Long valueOf = Long.valueOf(epochSecond);
        contentValues.put("date_added", valueOf);
        contentValues.put("date_modified", valueOf);
        contentValues.put("mime_type", "image/png");
        contentValues.put("width", Integer.valueOf(bitmap.getWidth()));
        contentValues.put("height", Integer.valueOf(bitmap.getHeight()));
        contentValues.put("relative_path", Paths.get(Environment.DIRECTORY_PICTURES, new String[]{"Screenshots"}).toString());
        contentValues.put("is_pending", 1);
        return C47633f.m84733g(this.f94149a.mo50874d(new C46818g(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues))).mo51516i(new C35968c(this, bitmap), this.f94151c).mo51516i(new C35969d(this), this.f94153e);
    }
}
