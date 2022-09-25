package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.graphics.C1924a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.ac */
/* compiled from: PG */
final class C0505ac implements C0677gl {

    /* renamed from: a */
    public final int[] f2038a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b */
    public final int[] f2039b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c */
    public final int[] f2040c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

    /* renamed from: d */
    public final int[] f2041d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e */
    public final int[] f2042e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f */
    public final int[] f2043f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    /* renamed from: a */
    public static final boolean m1890a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final ColorStateList m1891b(Context context, int i) {
        int b = C0730ik.m2465b(context, R.attr.colorControlHighlight);
        int a = C0730ik.m2464a(context, R.attr.colorButtonNormal);
        return new ColorStateList(new int[][]{C0730ik.f2584a, C0730ik.f2586c, C0730ik.f2585b, C0730ik.f2588e}, new int[]{a, C1924a.m5188g(b, i), C1924a.m5188g(b, i), i});
    }

    /* renamed from: c */
    public static final LayerDrawable m1892c(C0678gm gmVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = gmVar.mo3100c(context, R.drawable.abc_star_black_48dp);
        Drawable c2 = gmVar.mo3100c(context, R.drawable.abc_star_half_black_48dp);
        if ((c instanceof BitmapDrawable) && c.getIntrinsicWidth() == dimensionPixelSize && c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) c;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    /* renamed from: d */
    public static final void m1893d(Drawable drawable, int i, PorterDuff.Mode mode) {
        Rect rect = C0571cn.f2215a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0506ad.f2044a;
        }
        mutate.setColorFilter(C0506ad.m1894b(i, mode));
    }
}
