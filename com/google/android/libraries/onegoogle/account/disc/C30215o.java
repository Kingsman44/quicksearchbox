package com.google.android.libraries.onegoogle.account.disc;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.p2378b.C30811a;
import com.google.android.libraries.onegoogle.p2378b.C30826c;
import com.google.android.libraries.onegoogle.p2378b.C30830g;
import java.util.Locale;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.o */
/* compiled from: PG */
public final /* synthetic */ class C30215o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30224x f81681a;

    public /* synthetic */ C30215o(C30224x xVar) {
        this.f81681a = xVar;
    }

    public final void run() {
        int i;
        String str;
        C30224x xVar = this.f81681a;
        ImageView imageView = (ImageView) xVar.f81702a.get();
        if (!xVar.f81706e && imageView != null) {
            if (xVar.f81703b != null) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null || layoutParams.width <= 0) {
                    i = imageView.getWidth();
                } else {
                    i = layoutParams.width;
                }
                int paddingLeft = i - (imageView.getPaddingLeft() + imageView.getPaddingRight());
                int i2 = paddingLeft < 0 ? 0 : paddingLeft;
                C30158c cVar = xVar.f81705d;
                Object obj = xVar.f81703b;
                Locale locale = Locale.ROOT;
                Object[] objArr = new Object[2];
                if (obj == null) {
                    str = "null";
                } else {
                    StringBuilder sb = new StringBuilder(cVar.mo35552c(obj));
                    String e = cVar.mo35554e(obj);
                    if (e != null) {
                        sb.append(" ");
                        sb.append(e);
                    }
                    str = sb.toString();
                }
                objArr[0] = str;
                objArr[1] = Integer.valueOf(i2);
                String format = String.format(locale, "%s %s", objArr);
                Drawable drawable = (Drawable) C30225y.f81708a.get(format);
                if (drawable != null) {
                    xVar.mo35696d(drawable, true);
                    return;
                }
                C30811a aVar = (C30811a) xVar.f81704c;
                C30830g gVar = aVar.f83137a;
                C30830g gVar2 = aVar.f83138b;
                Drawable drawable2 = (Drawable) C30225y.f81709b.get(format);
                if (drawable2 != null) {
                    xVar.mo35696d(drawable2, false);
                }
                gVar.mo35681a(xVar.f81703b, i2, new C30219s(xVar, format, drawable2, gVar2, i2));
                return;
            }
            C30826c cVar2 = ((C30811a) xVar.f81704c).f83140d;
            xVar.mo35696d(C30826c.m57574a(imageView.getContext()), true);
        }
    }
}
